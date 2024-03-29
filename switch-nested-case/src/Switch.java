import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//      old way
        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            default:
                System.out.println("enter a vailid fruit");
                break;
        }
    }
}
