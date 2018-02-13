package decoratorpattern;

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}
