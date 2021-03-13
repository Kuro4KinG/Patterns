public class BreakfastFacade {
    Coffee coffee = new Coffee();
    FriedEgg friedEgg = new FriedEgg();
    Sandwich sandwich = new Sandwich();

    public void cookBreakfast() {
        System.out.println("Cooking Breakfast...");
        friedEgg.cookFriedEgg();
        sandwich.cookSandwich();
        coffee.makeCoffee();
        System.out.println("Breakfast is cooked! Enjoy your meal!");
    }
}
