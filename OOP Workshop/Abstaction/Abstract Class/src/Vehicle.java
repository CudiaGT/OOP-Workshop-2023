abstract class Vehicle {
    private String type = "Vehicle";    //Note that "type" can be a private member in an abstract class.
    String specificType;
    abstract void start();
    abstract void stop();
    //The functions must be defined later, but the field does not have to be used.
}
