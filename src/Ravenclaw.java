import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int creative;
    private String faculty = "Ravenclaw";
    public Ravenclaw(String name, int powerMagic, int transgressionDistance, int smart, int wise, int creative) {
        super(name, powerMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }
    public int comparisonOne() {
        return smart + wise + creative;
    }
    public int getSmart() {
        return smart;
    }
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public int getWise() {
        return wise;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public int getCreative() {
        return creative;
    }
    public void setCreative(int creative) {
        this.creative = creative;
    }
    public String getFaculty() {
        return faculty;
    }
    public String toString() {
        return "Имя: " + getName() +
                "\nФакультет: Gryffindor" +
                ",\nСила магии = " + getPowerMagic() +
                ",\nРасстояние трансгрессии = " + getTransgressionDistance() +
                ",\nОстроумие = " + smart +
                ",\nМудрость = " + wise +
                ",\nТворчество = " + creative + "\n";
    }

}

