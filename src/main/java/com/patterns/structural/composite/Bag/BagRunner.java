public class BagRunner {
    public static void main(String[] args) {
        Shirt redShirt = new Shirt("Red");
        Shirt blueShirt = new Shirt("Blue");
        Shirt greenShirt = new Shirt("Green");
        Shirt blackShirt = new Shirt("Black");
        Tie redTie = new Tie("Red");
        Tie blueTie = new Tie("Blue");
        Tie greenTie = new Tie("Green");
        Hat redHat = new Hat("Red");
        Hat blueHat = new Hat("Blue");
        Socks redSocks = new Socks("Red");
        Bag redBag = new Bag("Red");
        Bag blueBag = new Bag("Blue");
        Bag greenBag = new Bag("Green");
        Bag blackBag = new Bag("Black");
        Bag allBags = new Bag("White");

        allBags.addItem(redBag);
        allBags.addItem(blueBag);
        allBags.addItem(greenBag);
        greenBag.addItem(blackBag);
        redBag.addItem(redShirt);
        redBag.addItem(redTie);
        redBag.addItem(redHat);
        redBag.addItem(redSocks);
        blueBag.addItem(blueShirt);
        blueBag.addItem(blueTie);
        blueBag.addItem(blueHat);
        greenBag.addItem(greenShirt);
        greenBag.addItem(greenTie);
        blackBag.addItem(blackShirt);

        allBags.getName();

    }
}
