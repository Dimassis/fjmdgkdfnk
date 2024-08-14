import java.util.Random;
public class Pupils {
    private final Hogwarts[] pupil = {
        new Gryffindor("Harry Potter", getRandom(), getRandom() , getRandom(), getRandom(), getRandom()),
        new Gryffindor("Hermione Granger", getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Gryffindor("Ron Weasley", getRandom(), getRandom(), getRandom(),getRandom() ,getRandom()),
        new Slytherin("Draco Malfoy", getRandom(), getRandom() , getRandom(), getRandom(), getRandom(), getRandom()),
        new Slytherin("Graham Montague", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Slytherin("Gregory Goyle", getRandom() , getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Hufflepuff("Zachariah Smith", getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Hufflepuff("Cedric Diggory", getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Hufflepuff("Justin Finch-Fletchley", getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Ravenclaw("Zhou Chang", getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Ravenclaw("Padma Patil", getRandom(), getRandom(), getRandom(), getRandom(), getRandom()),
        new Ravenclaw("Marcus Belby", getRandom(), getRandom(), getRandom(), getRandom(), getRandom())
    };


    public void descriptionPupil(String name) {
        for (Hogwarts hogwarts : pupil) {
            if (hogwarts.getName().equals(name)) {
                System.out.println(hogwarts.toString());
            }
        }
    }
    public void comparisonInsideFaculty(String name1, String name2) {
        String faculty1 ="";
        String faculty2 = "";
        for (Hogwarts hogwarts : pupil) {
            if (hogwarts.getName().equals(name1)) {
                faculty1 = hogwarts.getFaculty();
            }
            if (hogwarts.getName().equals(name2)) {
                faculty2 = hogwarts.getFaculty();
            }
        }
        int x = 0, y = 0;
        if(faculty2 != faculty1) {
            System.out.println("Ученики из разных факультетов");
        } else {
            System.out.println("Сравнение учеников из " + faculty1);
           for(Hogwarts hogwarts : pupil) {
               if(hogwarts.getName().equals(name1)) {
                x = hogwarts.comparisonOne();
                   System.out.println("У " + name1 + " Сумма баллов ровна " + hogwarts.comparisonOne());
               }if(hogwarts.getName().equals(name2)) {
                   y = hogwarts.comparisonOne();
                   System.out.println("У " + name2 + " Сумма баллов ровна " + hogwarts.comparisonOne());
               }
           }
            if(x > y) {
                System.out.println(name1 + " обладает большей магией, чем " + name2);
            } else if (x < y) {
                System.out.println(name2 + " обладает большей магией, чем " + name1);
            } else {
                System.out.println(name1 + " и " + name2 + " равны");
            }
        }
    }

    public void comparisonOutsideFaculty(String name1, String name2) {
        int x = 0,y = 0;
        for (Hogwarts hogwarts : pupil) {
            if (hogwarts.getName().equals(name1)) {
                System.out.println("У " + name1 + " cумма балов ровна " + hogwarts.comparison());
                x = hogwarts.comparison();
            }
            if (hogwarts.getName().equals(name2)) {
                System.out.println("У " + name2 + " cумма балов ровна " + hogwarts.comparison());
                y = hogwarts.comparison();
            }
        }
        if(x > y) {
            System.out.println(name1 + " обладает большей магией, чем " + name2);
        } else if (x < y) {
            System.out.println(name2 + " обладает большей магией, чем " + name1);
        } else {
            System.out.println(name1 + " и " + name2 + " равны");
        }
    }
    public int getRandom() {
        Random random = new Random();
        return Math.abs(random.nextInt(1, 11));
    }
}