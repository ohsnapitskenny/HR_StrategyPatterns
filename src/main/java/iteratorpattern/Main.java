package iteratorpattern;

public class Main {
    Warehouse warehouse;

    Main() {
        warehouse = createWarehouse();
        createPhones();
        showPhones();
    }

    public static void main(String[] args) {
        new Main();
    }

    private Warehouse createWarehouse() {
        return new Warehouse();
    }

    private void createPhones() {
        warehouse.addPhone(new Phone("iPhone X",1159));
        warehouse.addPhone(new Phone("iPhone 8 Plus",929));
        warehouse.addPhone(new Phone("iPhone 8",769));
    }

    private void showPhones() {
        PhoneIterator iterator = new PhoneIterator(warehouse.getPhones());

        while (iterator.hasNext()) {
            Phone p = iterator.next();
            System.out.println("The " + p.getModel() + " is available starting at the price of €" + p.getPrice());
        }
    }
}
