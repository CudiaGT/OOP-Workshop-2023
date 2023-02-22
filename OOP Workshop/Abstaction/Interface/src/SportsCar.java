public class SportsCar implements Vehicle, Car{ //Note that there is multiple inheritance taking place here.
    private String specificType;
    SportsCar(String st) {
        specificType = st;
    }
    public void start() {
        System.out.println("The " + specificType + " has started.");
    }
    public void stop() {
        System.out.println("The " + specificType + " has stopped.");
    }
    public void drive() {
        System.out.println("The " + specificType + " is driving.");
    }
}
