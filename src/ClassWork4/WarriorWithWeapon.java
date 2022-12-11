package ClassWork4;

public class WarriorWithWeapon<T extends Weapon> extends Warrior{

    protected T weapon;

    public WarriorWithWeapon(String name, Integer healthPoint, T weaponn) {
        super(name, healthPoint);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", weapon, super.toString());
    }
}
