public abstract class Character {

    WeaponBehavior weaponBehavior;

    public Character() {
        introduce();
    }

    public abstract void introduce();

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        System.out.println("Замена оружия!");
        this.weaponBehavior = weaponBehavior;
    }


}
