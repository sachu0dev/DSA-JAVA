
public class Main {
    public static void main(String[] args) {
        System.out.println("this is a test run");
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for( int j = i; j  > 1; j--){
                System.out.print("*");
            }
        }
    }
}