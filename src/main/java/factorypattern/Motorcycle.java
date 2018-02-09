package factorypattern;

class Motorcycle extends Vehicle {
    String brand = "Yamaha";
    int speed = 180;

    public void move() {
        System.out.println("This vehicle with the brand " + brand +" is moving with a speed of " + speed + " Km per hour");
    }
}
