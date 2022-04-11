package car.rental.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "COMPANY")
@Data
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;

    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private Integer id;

    @Column(name = "city")
    private String city;

    @OneToMany(targetEntity = Car.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Car> cars;
}
