package oppsExPack;


//Define a class named 'Car'
class Car {
    String color;
    String model;
    int year;

    void startEngine() {
        System.out.println("The engine is starting...");
    }

    void stopEngine() {
        System.out.println("The engine is stopping...");
    }

    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
}

public class ClassEx {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2021);

        System.out.println("Car 1: " + car1.color + " " + car1.model + " (" + car1.year + ")");
        car1.startEngine();

        System.out.println("Car 2: " + car2.color + " " + car2.model + " (" + car2.year + ")");
        car2.stopEngine();
    }
}
