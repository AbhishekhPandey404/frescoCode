package oppsExPack;


abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("The vehicle is stopping.");
    }
}



class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("The bike is starting.");
    }
}

public class AbstractionEx {
    public static void main(String[] args) {
        
        Vehicle myBike = new Bike();

        myBike.start();
        myBike.stop();
    }
}
