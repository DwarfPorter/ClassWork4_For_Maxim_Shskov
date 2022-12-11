package ClassWork4;

public class Shield implements Protection{


    @Override
    public String toString() {
        return String.format("Shield - %d",protection());
    }

    @Override
    public Integer protection() {
        return 40;
    }
}

