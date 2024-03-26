import java.util.Scanner;

public class palindrome {
//    8 To find out whether the given String is Palindrome or not.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter a string");
    String s = in.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

    ;

    String rev = "";
    for(int i = s.length() -1; i >= 0; i--){
        rev = rev + s.charAt(i);
    }
    if(rev.equals(s)){
        System.out.println("isPalidrome");
    } else{
        System.out.println("isNotPalidrome");
    }
}
}