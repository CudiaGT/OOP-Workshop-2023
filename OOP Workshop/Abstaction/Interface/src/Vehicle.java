interface Vehicle {
    //Note that the access modifiers are not required because everything in an interface is public.
    String type = "Vehicle";
    abstract void start();
    abstract void stop();
}
