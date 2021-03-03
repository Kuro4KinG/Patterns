public class Troll extends Character {

    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void introduce() {
        System.out.println("I'm a Troll!");
    }
}
