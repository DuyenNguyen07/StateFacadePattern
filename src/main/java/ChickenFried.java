public class ChickenFried implements Food {

    public void cook() {
        buyIngredients();
        prepareIngredients();
        fryChicken();
    }

    public void buyIngredients() {
        System.out.println("Buying chicken...");
    }

    public void prepareIngredients() {
        System.out.println("Washing chicken...");
        System.out.println("Cutting chicken into pieces...");
        System.out.println("Marinating chicken...");
    }

    public void fryChicken() {
        System.out.println("Turn on induction cooktop...");
        System.out.println("Heating up pan...");
        System.out.println("Pouring oil...");
        System.out.println("Frying...");
        System.out.println("Chicken fried is ready to serve...");
    }



}
