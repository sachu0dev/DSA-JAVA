import java.util.Scanner;

public class calculator {
//    4 Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter first number :");
    float a = in.nextFloat();
    System.out.println("enter second number :");
    float b = in.nextFloat();
    System.out.println("Enter the operation :");
    char o = in.next().trim().charAt(0);

    if(o == '+'){
        System.out.println(a+b);
    } else if (o == '-') {
        System.out.println(a-b);
    }else if (o == '*') {
        System.out.println(a*b);
    }else if (o == '/') {
        System.out.println(a/b);
    } else {
        System.out.println("wrong opration");
    }

}
}
