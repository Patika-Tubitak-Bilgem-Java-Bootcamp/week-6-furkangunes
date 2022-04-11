package car.rental.demo.enums;

public enum CarType {
    SEDAN("Sedan"),
    SUV("SUV"),
    MINIVAN("Minivan"),
    HATCHBACK("Hatchback"),
    CROSSOVER("Crossover"),
    COUPE("Coupe"),
    CONVERTIBLE("Convertible"),
    VAN("Van"),
    WAGON("Wagon"),
    PICKUP("Pickup");

    private String name;

    CarType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
