public class Main {
    public static void main(String[] args) {
        Characters Pikachu = new Characters("Pikachu", 5, "Attack", "Heal");

        System.out.println(Pikachu.getName());  //Prints Pikachu
        Pikachu.setName("Raichu");              //Changes name of Pikachu to Raichu (The object is still Pikachu)
        System.out.println(Pikachu.getName());  //Prints Raichu

        /*
        System.out.println(Pikachu.getLevel()); //Prints the level 5
        Pikachu.setLevel(9999);                 //Sets the level to 9999 (Compile Error)
        System.out.println(Pikachu.getLevel()); //Prints the level 9999
        */
    }
}