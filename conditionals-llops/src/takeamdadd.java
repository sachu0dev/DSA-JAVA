import java.util.Scanner;

public class takeamdadd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int high = 0;
        int a = 1;
        while(a != 0){
            int temp = in.nextInt();
            if(high < temp){
                high = temp;
            }
            if(temp == 0){
                a = 0;
            }
        }
        System.out.println(high);
    }
}
