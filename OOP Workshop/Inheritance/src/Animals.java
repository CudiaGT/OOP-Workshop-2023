public class Animals {
    private String species;
    private String name;
    private int age;
    public Animals (String s, String n, int a) {
        species = s;
        name = n;
        age = a;
    }

    //Assume that all animals sleep.
    public String sleep() {return "ZZZ";}

    //Assume that all animals eat.
    public String eat() {return name + ", " + "the " + species + ", is eating.";}
}
