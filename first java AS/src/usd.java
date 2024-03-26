import java.util.Scanner;

public class usd {
//    6 Input currency in rupees and output in USD.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter ruppes :");
    float rp = in.nextFloat();
    System.out.println(rp + " in USD is :" + rp/83.59);
}
}
