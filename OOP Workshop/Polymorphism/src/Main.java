public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();     //Because Animal is not abstract, there can be an instance of an Animal.
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        myAnimal.eat();
        myDog.eat();
        myCat.eat();
    }
}