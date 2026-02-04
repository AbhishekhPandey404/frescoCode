package oppsExPack;

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.breed = "Golden Retriever";
        
        dog1.eat();  // Inherited from Animal
        dog1.sleep(); // Inherited from Animal
        dog1.bark(); // Defined in Dog class
    }
}
