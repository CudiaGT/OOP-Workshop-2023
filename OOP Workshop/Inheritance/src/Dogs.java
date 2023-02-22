public class Dogs extends Animals {
    public Dogs (String s, String n, int a) {
        super(s, n, a);
    }

    public String makeSound() {return "Woof";}
    public String run() {return "The dog is running";}
}