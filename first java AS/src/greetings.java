import java.util.Scanner;

public class greetings {
//     2 Take name as input and print a greeting message for that particular name.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name :");
    String name = in.nextLine();
    System.out.println("Hey "+ name + " How was your day");
}
}
