public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void introduce() {
        System.out.println("I'm a Knight!");
    }
}
