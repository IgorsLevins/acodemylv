package lv.acodemy.classroom;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
        Scanner chatBot = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = chatBot.next();

        System.out.println("What is your last name?");
        String lastName = chatBot.next();

        System.out.printf("Hello %s %s. My name is Bot Alex K. How can I help?%n", name, lastName);
        // %n = new line
        // \n = new line

        System.out.println("Press 1 for registration or press 2 to stop chat");
        byte answer = chatBot.nextByte();
        boolean isCorrect = false;
        while (isCorrect == false) {
            if (answer == 1) {
                System.out.println("Please enter the date in following format: (dd-MM-yyyy)");
                String registrationDate = chatBot.next();
                System.out.println("You've registration on date:" + registrationDate);
                isCorrect = true;
            } else if (answer == 2) {
                System.out.println("OK, this chat will be closed now!");
                chatBot.close();
                isCorrect = true;
            } else {
                System.out.println("Option is not correct! Try again!");
                System.out.println("Press 1 for registration or press 2 to stop chat");
                answer = chatBot.nextByte();
            }
        }
        if(answer == 1) {
            System.out.println("You are going to use insurance? (Correct answer: trure or false)");
            String isInsured = chatBot.next();
            isCorrect = false;
            while (isCorrect == false) {
                if (isInsured.equals("true")) {

                }
            }
        }


    }
}
