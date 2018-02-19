import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaFactoryTest {

    @Test
    void createPizza() {
        String stringPizza = "1";
        String expectedPizzaName = "Pizza dough, Tomato Sauce, Salami";

        Pizza pizza = PizzaFactory.makePizza(stringPizza);

        Assertions.assertNotNull(pizza);
        Assertions.assertEquals(expectedPizzaName, pizza.getDescription());
//

    }

}