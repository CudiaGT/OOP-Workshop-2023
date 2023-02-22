public class Bicycle extends Vehicle{
    Bicycle(String t) {
        specificType = t;
    }
    void start() {  //abstract methods are considered public unless coded otherwise.
        System.out.println("The " + specificType + " has started.");
    }

    void stop() {
        System.out.println("The " + specificType + "has stopped");
    }
}
