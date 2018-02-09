package factorypattern;

class VehicleFactory {

    static Vehicle makeVehicle(String stringVehicle) throws NumberFormatException {
        try {
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
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number.");
            return null;
        }

    }
}
