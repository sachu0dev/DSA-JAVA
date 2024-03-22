import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year");

        int year = myObj.nextInt();
        int test = year % 4;
        if(test == 0){
            System.out.println("its is a leap year");
        } else{
            System.out.println("not a leap year");
        }
    }
}