public class Bicycle implements Vehicle {
    private String specificType;

    Bicycle(String st) {
        specificType = st;
    }
    public void start(){
        System.out.println("The " + specificType + " has started.");
    }
    public void stop(){
        System.out.println("The " + specificType + " has stopped.");
    }
}