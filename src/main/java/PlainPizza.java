public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Pizza dough";
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}
