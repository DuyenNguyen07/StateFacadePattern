public class FoodFacade {
    private Food chickenFried;
    private Food pho;
    private Food soup;

    public FoodFacade() {
        this.chickenFried = new ChickenFried();
        this.pho = new Pho();
        this.soup = new Soup();
    }

    public void cookChickenFried(){
        chickenFried.cook();
    }

    public void cookPho() {
        pho.cook();
    }

    public void cookSoup() {
        soup.cook();
    }
}
