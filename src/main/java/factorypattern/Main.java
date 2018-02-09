package factorypattern;

import java.util.Scanner;

public class Main {
    private String[] vehicles = {"Car", "MotorCycle", "Bike"};
    private Scanner sc = new Scanner(System.in);

    Main() {
        showOptions();
    }

    public static void main(String[] args) {
        new Main();
    }

    private void showOptions() {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(i + ") " + vehicles[i]);
        }
        askForChoice();
    }

    private void askForChoice() {
        String input = sc.next();
        Vehicle vehicle = VehicleFactory.makeVehicle(input);

        if (vehicle != null) {
            vehicle.move();
        }
    }
}
