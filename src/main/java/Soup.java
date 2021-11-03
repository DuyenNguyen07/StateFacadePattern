public class Soup implements Food {

    public void cook() {
        buyIngredients();
        prepareIngredients();
        boilSoup();
    }

    public void buyIngredients() {
        System.out.println("Buying meat and vegetables...");
    }

    public void prepareIngredients() {
        System.out.println("Washing meat and vegetables...");
        System.out.println("Cutting meat and vegetables into pieces...");
        System.out.println("Marinating meat...");
    }

    public void boilSoup() {
        System.out.println("Turn on the induction cooktop...");
        System.out.println("Heating up the pot...");
        System.out.println("Boiling water with meat...");
        System.out.println("Adding vegetables into the pot...");
        System.out.println("Pho is ready to serve...");
    }
}
