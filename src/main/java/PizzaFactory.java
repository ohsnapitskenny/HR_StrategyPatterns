public class PizzaFactory {

    public static Pizza makePizza(String stringPizza) {
        try {
            int pizzaNumber = Integer.parseInt(stringPizza);

            switch (pizzaNumber) {
                case 0:
                    return new TomatoSauce(new PlainPizza());
                case 1:
                    return new Salami(new TomatoSauce(new PlainPizza()));
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
