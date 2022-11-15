package lv.acodemy.classroom;


public class MethodsExample {
    public static void main(String[] args) {
        printMyFullName();
        printMyFullName("John", "Doe");

        System.out.println(pow(4));

        for (int i = 0; i < 3; i++) {
            printMyFullName("Max", "Pain");
        }

        System.out.println();

        System.out.println(isPalindrome("Civic"));



    }

    // Method overloading
    public static void printMyFullName() {
        System.out.println("Igor Levin");
    }

    public static void printMyFullName(String name, String lastName) {
        System.out.println(name + " " + lastName);
    }

    public static void printInfoAboutMe(String name, String lastName, int age) {
        System.out.println("My name is %s. My last name is %s. I am %s years old%n");
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int pow(int number) {
        // int result = number * number;
        // return result;

        return number * number;

    }
    public static boolean isPalindrome(String palindromeWord) {
        String word = "";

        for (int i = palindromeWord.length() - 1; i >= 0 ; i--) {
            word = word + palindromeWord.charAt(i);
        }
        System.out.println("Word = " + word);
        return word.equals(palindromeWord);
    }

    public static void printInfoAboutTimes(String name, String lastName, int age, int) {

        System.out.printf("My name is %s. My last name is %s. I am %s years old%n", name, lastName, age);
    }

}
