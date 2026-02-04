package oppsExPack;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        person1.displayInfo();
        person2.displayInfo();
    }
}
