package factorypattern;

public abstract class Vehicle {
    String brand;
    int speed;

    public void move() {
        System.out.println("This vehicle is moving with a speed of " + speed + " Km per hour");
    }
}
