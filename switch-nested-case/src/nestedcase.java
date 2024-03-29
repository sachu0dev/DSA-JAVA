import java.util.Scanner;

public class nestedcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("sushil");
            case 2 -> System.out.println("rahul");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("it department");
                    case "sales" -> System.out.println("sales departement");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("wrong id");
        }
    }
}
