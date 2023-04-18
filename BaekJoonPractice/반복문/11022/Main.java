import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=T;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum = b + c;
            System.out.println("Case #" + i + ": " + b + " + " + c + " = " + String.valueOf(sum));
;        }
        sc.close();
    }
}