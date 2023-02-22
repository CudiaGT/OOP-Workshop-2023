public class Main {
    public static void main(String[] args) {
        Car Ferrari = new Car();
        Bicycle BMX = new Bicycle("BMX");
        Ferrari.start();
        Ferrari.stop();
        BMX.start();
        BMX.stop();

        //Vehicle Boeing787 = new Vehicle();    //Instances cannot be made from an abstract classes.
    }
}