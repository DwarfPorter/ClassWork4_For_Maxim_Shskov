package ClassWork4;

public class Hero extends WarriorWithWeaponAndShield {


    public Hero(String name, Integer healthPoint, Weapon weapon,Protection protection) {
        super(name, healthPoint, weapon, protection);
    }

    public String toString() {
        return String.format("Hero - %s",super.toString());
    }
}
