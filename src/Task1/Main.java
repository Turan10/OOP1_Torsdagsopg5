package Task1;

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Turan", 27);

        driver1.setName("Janes");
        Car car1 = new Car("Porsche", "Taycan", 2022, "Coupe", driver1.getName());
        Car car2 = new Car("BMW","M5", 2023, "Sedan", driver1.getName());

        System.out.println(car1);
        System.out.println(driver1);
        System.out.println(car2);
        System.out.println(driver1);




    }
}
