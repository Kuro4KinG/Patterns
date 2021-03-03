public class King extends Character {


    public King() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void introduce() {
        System.out.println("I'm a King!");
    }
}
