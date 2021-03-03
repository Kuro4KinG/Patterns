public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void introduce() {
        System.out.println("I'm a Queen!");
    }
}
