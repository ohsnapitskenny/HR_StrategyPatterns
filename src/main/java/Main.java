import java.util.Scanner;

public class Main {
//    private List<Pizza> pizzas = new ArrayList();
    private Pizza[] pizzas = new Pizza[2];

    Main() {
        greetings();
        createPizzas();
        showMenu();
        askForPizza();
    }

    public static void main(String[] args) {
        new Main();
    }

    private void greetings() {
        System.out.println("It's pizza time! Which one do you want to order?");
    }

    private void createPizzas() {
        Pizza pizza1 = PizzaFactory.makePizza("0");
        Pizza pizza2 = PizzaFactory.makePizza("1");
        pizzas[0] = pizza1;
        pizzas[1] = pizza2;

//        pizzas.add(pizza1);
//        pizzas.add(pizza2);
    }

    private void showMenu() {
        PizzaIterator iterator = new PizzaIterator(pizzas);
        int index = 0;

        while (iterator.hasNext()) {
            Pizza p = iterator.next();
            System.out.println(index + ") The " + p.getDescription() + " has a price of €" + p.getCost());
            index++;
        }
    }

    private void askForPizza() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pizza order = PizzaFactory.makePizza(input);

        if (order != null) {
            System.out.println("Your " + order.getDescription() + " is ready! Bon Appetite!");
        } else {
            askForPizza();
        }

    }
}
