import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pupils pupils = new Pupils();
        pupils.descriptionPupil("Harry Potter");
        pupils.descriptionPupil("Marcus Belby");


        pupils.comparisonOutsideFaculty("Harry Potter", "Marcus Belby");
        pupils.comparisonInsideFaculty("Padma Patil", "Zhou Chang");
    }
}