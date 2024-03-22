import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter a num");
        int num = myobj.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(num + " * "+ i +" = " + (num * i));
        }
    }
}