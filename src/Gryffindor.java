import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private String faculty = "Gryffindor";

    public Gryffindor(String name, int powerMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int comparisonOne() {
        return honor + courage + nobility;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getCourage() {
        return courage;
    }
    public void setCourage(int courage) {
        this.courage = courage;
    }
    public String getFaculty() {
        return faculty;
    }
    @Override
    public String toString() {
        return "Имя: " + getName() +
                "\nФакультет: Gryffindor" +
                ",\nСила магии = " + getPowerMagic() +
                ",\nРасстояние трансгрессии = " + getTransgressionDistance() +
                ",\nБлагородство = " + nobility +
                ",\nЧесть = " + honor +
                ",\nХрабрость = " + courage + "\n";
    }

    public void comparisonInsideFaculty(Hogwarts name1, Hogwarts name2) {
        System.out.println(name1.equals(name2));
    }
}

