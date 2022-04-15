package Java;

class Main {
    public static void main(String[] args) {
        /*System.out.println("Hola mundo");*/
        UberX uberX= new UberX("AMQ0123",new Account("Andres Herrera", "AND123"),"Chevrolet","Sonic");
        uberX.setPassenger(2);


        uberX.printDataCar();

        UberVan uberVan = new UberVan("AFF234",new Account("Andres Herrera 2.0", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        

        /*Car car2= new Car("QERF123",new Account("Andrea Herrera", "QWER123"));
        car2.license="QERF123";
        car2.passenger = 3;
        car2.printDataCar();
        */
    }
}