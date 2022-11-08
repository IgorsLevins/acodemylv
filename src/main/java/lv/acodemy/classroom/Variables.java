package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {

        // Line comment

        /*
        Hello World!
        My name is Igor!
         */

        // byte
        byte byteVariable = 120;
        System.out.println(byteVariable);

        //short
        short salary = 2000;
        System.out.println(salary);

        // char

        char letterA = 'A';
        System.out.println(letterA);

        // int
        int populationInLatvia = 2000000;
        System.out.println(populationInLatvia);

        // integer min and max values
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        // float
        float stockPrice = 5000.50f;
        System.out.println(stockPrice);

        // long
        long coronavirusCases = 63674384L;
        System.out.println(coronavirusCases);

        // double
        double twittersPriceInEur = 20659.54;

        // boolean prefix_ is or has
        boolean isSummer = false;
        boolean isAutumn = true;
        boolean hasValue = true;

        System.out.println(isAutumn);


        int firstNumber = 15;
        int secondNumber = 12;
        int result = firstNumber - secondNumber;
        System.out.println(result);

        String name = "Igor";
        System.out.println(name);

        String surname = "Levin";
        System.out.println(name + " " + surname);

        System.out.print("Variabl\n");
        System.out.print("Variabldff....");

        String fullName = String.format("\nHello %s. I guess youre surname is: %s", name, surname);
        // %s - for next
        // %d - for numbers

        System.out.println(fullName);

        int number = 1991;
        System.out.println("My name is " + name + "." + " I was born in " + number);
        System.out.println(10 + 40);
        int res = 10 + 40;
        System.out.println("Summ:" + res);






    }
}
