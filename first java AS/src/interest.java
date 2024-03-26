import java.util.Scanner;

public class interest {
//    3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the the principal amount :");
    float p = in.nextFloat();
    System.out.println("Enter the time periond in years");
    float t = in.nextFloat();
    System.out.println("Enter the interest rate per year :");
    float r = in.nextFloat()/100;

    System.out.println("the interest is :"+ p*t*r);

}
}
