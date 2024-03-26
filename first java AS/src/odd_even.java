import java.util.Scanner;

public class odd_even {
//     1 Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
            return;
        }
        System.out.println(num + " is odd");
    }
}
