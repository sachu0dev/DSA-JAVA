public class countingOcurance {
    public static void main(String[] args) {
        int a = 13833433;
        int count = 0;
        while(a != 0){
            int temp = a % 10;
            a = a / 10;
            if(temp == 3){
                count ++;
            }
        }
        System.out.println(count);
    }
}
