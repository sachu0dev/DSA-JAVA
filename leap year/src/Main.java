import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year:");

        int year = myObj.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("It is a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
