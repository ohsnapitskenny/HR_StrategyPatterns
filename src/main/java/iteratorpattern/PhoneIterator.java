package iteratorpattern;

import java.util.Iterator;

public class PhoneIterator implements Iterator<Phone> {
    private Phone[] phones;
    private int index;

    public PhoneIterator(Phone[] phones) {
        this.phones = phones;
    }

    @Override
    public boolean hasNext() {
        return index < phones.length && phones[index] != null;
    }

    @Override
    public Phone next() {
        return phones[index++];
    }

    @Override
    public void remove() {

    }
}
