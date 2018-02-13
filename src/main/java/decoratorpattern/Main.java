package decoratorpattern;

public class Main {

    Main() {
        createPizza();
    }

    public static void main(String[] args) {
        new Main();
    }

    private void createPizza() {
        Pizza pizza1 = new TomatoSauce(new Salami(new PlainPizza()));
        Pizza pizza2 = new Salami(new PlainPizza());

        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
    }
}
