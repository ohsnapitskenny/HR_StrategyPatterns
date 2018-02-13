package iteratorpattern;

public class Warehouse {
    private Phone[] phones = new Phone[3];
    private int index;

    public void addPhone(Phone phone) {
        phones[index] = phone;
        index++;
    }

    public Phone[] getPhones() {
        return phones;
    }
}
