package decoratorpattern;

public class Salami extends ToppingDecorator {

    Salami(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Salami";
    }

    public double getCost() {
        return pizza.getCost() + 3.25;
    }
}
