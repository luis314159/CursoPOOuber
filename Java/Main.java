package Java;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car= new Car("AMQ0123",new Account("Andres Herrera", "AND123"));
        car.license="AMQ0123";

        car.printDataCar();

        Car car2= new Car("QERF123",new Account("Andrea Herrera", "QWER123"));
        car2.license="QERF123";
        car2.passenger = 3;
        car2.printDataCar();
    }
}