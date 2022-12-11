package ClassWork4;

public class Warrior {

    private String name;
    private Integer healthPoint;

    public Warrior(String name, Integer healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }


    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("name - %s,healthPoint - %d", name, healthPoint);
    }
}
