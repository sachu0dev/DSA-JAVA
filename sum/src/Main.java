import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter first number");
        int firstnum = myobj.nextInt();
        System.out.println("enter second number");
        int second = myobj.nextInt();
        int sum = firstnum + second;
        System.out.println(sum);
    }
}