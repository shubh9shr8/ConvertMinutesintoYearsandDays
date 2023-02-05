package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(45000000);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = ((minutes % 525600) / 1440);
            System.out.println(minutes + " 45000000 min = " + years + " y and " + days + " d");

        }
    }
}
