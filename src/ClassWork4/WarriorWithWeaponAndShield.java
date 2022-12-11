package ClassWork4;

public abstract class WarriorWithWeaponAndShield<T extends Weapon,P extends Protection> extends WarriorWithWeapon<T>  {
    private P protection;

    public WarriorWithWeaponAndShield(String name, Integer healthPoint, T weapon, P protection) {
        super(name, healthPoint, weapon);
        this.protection = protection;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", protection, super.toString());
    }
}
