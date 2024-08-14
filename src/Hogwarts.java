public class Hogwarts {
    private String name;
    private  int powerMagic;
    private int transgressionDistance;
    private String faculty;
    public Hogwarts(String name, int powerMagic, int transgressionDistance) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }
    public int comparison() {
        return powerMagic + transgressionDistance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPowerMagic() {
        return powerMagic;
    }
    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public String getFaculty() {
        return faculty;
    }
    public int comparisonOne() {
        return comparisonOne();
    }
}
