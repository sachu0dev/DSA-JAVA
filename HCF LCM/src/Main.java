import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first num :");
        int num1 = input.nextInt();
        System.out.println("Enter the second num :");
        int num2 = input.nextInt();
        List<Integer> factors1 = new ArrayList<>();
        List<Integer> factors2 = new ArrayList<>();

        List<Integer> common = new ArrayList<>();

        for(int i = 2; i < num1; i++ ){
            if(num1 % i == 0){
                factors1.add(i);
            }
        }
        for (int i =2; i < num2; i++){
            if(num2 % i == 0){
                factors2.add(i);
            }
        }
        int hcf = 1;
        for (int i = 0; i < factors1.size(); i++){
            for(int j = 0; j < factors2.size(); j++){
                if(factors2.get(j) == factors1.get(i)){
                    if(hcf < factors1.get(i)){
                        hcf = factors1.get(i);
                    }
                }
            }
        }
        int lcm = (num1 * num2 / hcf);
        System.out.println("the hcf of two number is :" + hcf);
        System.out.println("the lcm of two number is :" + lcm);

    }
}