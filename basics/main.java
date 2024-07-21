class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
    public void fetch() {
        System.out.println("Fetching...");
    }
}

public class main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Outputs "Bark"
        
        // Downcasting
        Dog myDog = (Dog) myAnimal;
        myDog.fetch(); // Outputs "Fetching..."
    }
}
