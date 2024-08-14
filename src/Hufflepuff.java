public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private String faculty = "Hufflepuff";

    public Hufflepuff(String name, int powerMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, powerMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int comparisonOne() {
        return hardworking + loyal + honest;
    }
    public int getHardworking() {
        return hardworking;
    }
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public int getHonest() {
        return honest;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
    public String getFaculty() {
        return faculty;
    }
    public String toString() {
        return "Имя: " + getName() +
                "\nФакультет: Gryffindor" +
                ",\nСила магии = " + getPowerMagic() +
                ",\nРасстояние трансгрессии = " + getTransgressionDistance() +
                ",\nТрудолюбие = " + hardworking +
                ",\nЛояльность = " + loyal +
                ",\nЧестность = " + honest + "\n";
    }

}
