public class TomatoSauce extends ToppingDecorator {

    TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {
        return pizza.getCost() + .75;
    }
}
