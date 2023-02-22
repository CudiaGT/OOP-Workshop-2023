public class Main {
    public static void main(String[] args) {
        SportsCar Ferrari = new SportsCar("Ferrari");
        Bicycle BMX = new Bicycle("BMX");

        Ferrari.start();
        Ferrari.stop();
        Ferrari.drive();
        BMX.start();
        BMX.stop();
        //BMX.drive();      //BMX did not implement the Car interface and therefore cannot "drive()"
    }
}