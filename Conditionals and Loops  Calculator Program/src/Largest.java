import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if(a > b){
            if(a > c) {
                max = a;
            } else{
                max= c;
            }
        } else if (b > c) {
            max = b;

        } else {
            max = c;
        }
        int max2 = Math.max(c, Math.max(a,b));
        System.out.println("the larget no is : " + max);
        System.out.println("the larget no is : " + max2);
    }
}
