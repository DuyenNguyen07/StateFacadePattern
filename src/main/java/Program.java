public class Program {
    public static void main(String[] args) {
        FoodFacade foodFacade = new FoodFacade();

        System.out.println("\n\n------------ Pho -------------");
        foodFacade.cookPho();

        System.out.println("\n\n------------ Soup -------------");
        foodFacade.cookSoup();

        System.out.println("\n\n------------ ChickenFried -------------");
        foodFacade.cookChickenFried();
    }
}
