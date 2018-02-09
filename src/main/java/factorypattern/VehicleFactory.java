package factorypattern;

class VehicleFactory {

    static Vehicle makeVehicle(String stringVehicle) {
        boolean validInput = false;

        do {
            int vehicleNumber = Integer.parseInt(stringVehicle);

            switch (vehicleNumber) {
                case 0:
                    return new Car();
                case 1:
                    return new Motorcycle();
                case 2:
                    return new Bike();
                default:
                    System.out.println("Please enter a valid command.");
                    return null;
            }
        } while (validInput);
    }
}
