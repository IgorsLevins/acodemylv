package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {
        // Operator : IF
        // boolean: true/false
        // 5 > 2 (true)
        // 10 < 1 (false)
        if (1 < 2) {
            System.out.println("Yes 1 < 2");
        }

        if (10 < 1) {
            System.out.println("Hello World!");
        }

        // boolean
        boolean isNikitaToxic = true;
        if (isNikitaToxic) {
            System.out.println("Spank him!");
        }

        // String example
        String myCity = "Riga";
        if (myCity.equals("Riga")) {
            System.out.println("Yes, city is Riga!");
            // call methods
            // create variables
            // create new objects
        }

        if (myCity.contains("Rig")) {
            System.out.println("Yes, city is Riga!");
        }

        String name = "Igor";
        if (!name.equals("John")) {
            System.out.println(name + " is not John, so it can be registered!");
        }

        // if-else
        int age = 20;
        if (age < 18) {
            System.out.println("Please come later!");
        } else {
            System.out.println("You can buy everything you want!");
        }

        // < = less or equals
        // = > more or equals

        // if-else-if-else

        // currentTime < = 11 && correntTime < 6 - > good morning!
        // currentTime < = 11 && correntTime < 17 - > good day!
        // currentTime < = 17 && correntTime < 24 - > good evening!
        // else -> good night!

        // && means AND (true / true)
        // || means OR

        int currentTime = 29;
        if (currentTime <= 11 && currentTime > 6)
        {
            System.out.println("Good morning!");
        } else if (currentTime > 11 && currentTime < 17) {
            System.out.println("Good day!");
        } else if (currentTime > 17 && currentTime < 24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }



    }
}