import java.util.Iterator;

public class PizzaIterator implements Iterator<Pizza> {

//    private List<Pizza> pizzas = new ArrayList();
    private Pizza[] pizzas;
    private int index;

    public PizzaIterator(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public boolean hasNext() {
        return index < pizzas.length && pizzas[index] != null;
    }

    @Override
    public Pizza next() {
        return pizzas[index++];
    }

    @Override
    public void remove() {

    }
}
