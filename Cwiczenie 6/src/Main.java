public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2022, 500.0, 20.0);
        Vehicle truck = new Truck("Ford", "F150", 2020, 300.0, 40.0, 2.5);

        System.out.println("Эффективность топлива автомобиля: " + car.calculateFuelEfficiency() + " миль на галлон");
        System.out.println("Эффективность топлива грузовика: " + truck.calculateFuelEfficiency() + " миль на галлон");
    }
}
