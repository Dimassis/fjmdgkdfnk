public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition ;
    private int resourcefulness;
    private String faculty = "Slytherin";
    public Slytherin(String name, int powerMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness) {
        super(name, powerMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }
    public int comparisonOne() {
        return cunning + determination + ambition + resourcefulness;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public String getFaculty() {
        return faculty;
    }
    public String toString() {
        return "Имя: " + getName() +
                "\nФакультет: Gryffindor" +
                ",\nСила магии = " + getPowerMagic() +
                ",\nРасстояние трансгрессии = " + getTransgressionDistance() +
                ",\nХитрость = " + cunning +
                ",\nАмбицозность = " + determination +
                ",\nНаходчивость = " + resourcefulness +
                ",\nАмбициозность = " + ambition + "\n";
    }
}
