import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 666;
        int count = 1;
        int n = sc.nextInt();
        while(count != n){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.print(num);
        sc.close();
    }
}