package factorypattern;

class Car extends Vehicle {
    String brand = "Tesla";
    int speed = 150;

    public void move() {
        System.out.println("This vehicle with the brand " + brand +" is moving with a speed of " + speed + " Km per hour");
    }
}
