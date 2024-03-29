import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        System.out.println(sum2());
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is : " + sum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }


//    Access modifier
//    return_type name (){
//      body
//    return statement;
//    }
}