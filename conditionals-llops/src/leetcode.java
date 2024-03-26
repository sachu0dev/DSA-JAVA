import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b  = 1;
         while (n != 0){
             int temp = n%10;
              a = a + temp;
              b = b * temp;
              n = n/10;
         }
        System.out.println(a);
        System.out.println(b);

    }
}
