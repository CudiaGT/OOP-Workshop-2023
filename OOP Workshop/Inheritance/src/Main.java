public class Main {
    public static void main(String[] args) {
        Dogs Sushi = new Dogs("Maltese", "Sushi", 3);
        Cats Sylvester = new Cats("Russian Blue", "Sylvester", 4);
        Animals Unknown = new Animals("Unknown", "Unknown 1", 5);

        System.out.println("Sushi");
        System.out.println(Sushi.sleep());
        System.out.println(Sushi.eat());
        System.out.println(Sushi.makeSound());
        System.out.println(Sushi.run());
        //System.out.println(Sushi.swim());         Compile Error (A dog does not know how to swim)
        System.out.println();

        System.out.println("Sylvester");
        System.out.println(Sylvester.sleep());
        System.out.println(Sylvester.eat());
        System.out.println(Sylvester.makeSound());
        //System.out.println(Sylvester.run());      Compile Error (A cat does not know how to run)
        System.out.println(Sylvester.swim());
        System.out.println();

        System.out.println("Unknown");
        System.out.println(Unknown.sleep());
        System.out.println(Unknown.eat());
        /*System.out.println(Unknown.makeSound());
        System.out.println(Unknown.run());
        System.out.println(Unknown.swim()); */
    }
}