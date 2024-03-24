public class Main {
    public static void main(String[] args) {
        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        } else{
            salary = salary + 1000;
        }
        for(int i = 1; i <=5; i++){
            System.out.println(i);
        }
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        } while(i<=10);
    }


}