import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("isLowercase");
        } else {
            System.out.println("isUppercase");
        }
        System.out.println(ch);
    }
}
