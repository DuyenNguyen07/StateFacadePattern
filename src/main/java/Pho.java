public class Pho implements Food {

    public void cook() {
        buyIngredients();
        prepareIngredients();
        boilPho();
    }

    public void buyIngredients() {
        System.out.println("Buying noodle and beef...");
    }

    public void prepareIngredients() {
        System.out.println("Washing beef...");
        System.out.println("Slicing beef...");
        System.out.println("Marinating beef...");
    }

    public void boilPho() {
        System.out.println("Turn on induction cooktop...");
        System.out.println("Heating up pot...");
        System.out.println("Boiling broth...");
        System.out.println("Putting noodle and beef in bowl...");
        System.out.println("Pouring broth into bowl...");
        System.out.println("Pho is ready to serve...");
    }
}
