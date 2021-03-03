public class GameRunner {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();

        System.out.println();

        Character queen = new Queen();
        queen.fight();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.fight();

        System.out.println();

        Character knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(new KnifeBehavior());
        knight.fight();

        System.out.println();

        Character troll = new Troll();
        troll.fight();
        troll.setWeaponBehavior(new AxeBehavior());
        troll.fight();

    }
}
