package factorypattern;

class Bike extends Vehicle {
    String brand = "Batavus";
    int speed = 20;

    public void move() {
        System.out.println("This vehicle with the brand " + brand +" is moving with a speed of " + speed + " Km per hour");
    }
}
