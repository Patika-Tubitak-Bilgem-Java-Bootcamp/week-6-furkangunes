package car.rental.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.provider.HibernateUtils;

import car.rental.demo.entity.Car;
import car.rental.demo.entity.Company;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Company company = new Company();
		Car car = new Car();
		Set<Car> set = new HashSet<>();
		set.add(car);
		company.setCity("New York");
		company.setCars(set);
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(company);
		session.getTransaction().commit();
		session.close();
		System.out.println(company.getCars().stream().map(Car::getId).collect(Collectors.toList()));
		SpringApplication.run(DemoApplication.class, args);
	}

}
