import java.util.Scanner;

public class fibonachy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= num; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
