package ClassWork4;

public class Archer extends WarriorWithWeaponAndShield<Bow,Shield> {
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Archer(String name, Integer healthPoint, Bow weapon, Shield protection, Integer range) {
        super(name, healthPoint, weapon, protection);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer - %s,range - %d",super.toString(),range);
    }
}
