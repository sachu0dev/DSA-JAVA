import java.sql.Struct;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int sum = 0;
        while (true){
            String num = myobj.nextLine();

            if(num.equals("x")) {
                System.out.println("the sum of input is is: " + sum);
                break;
            }
            sum = sum + Integer.parseInt(num);
        }
    }
}