public class testStaticProperty {

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv");
        System.out.println(Car.nuberOfCars);
         Car car2 = new Car("rollroise","fnasjnfa");
        System.out.println(Car.nuberOfCars);
    }
}
