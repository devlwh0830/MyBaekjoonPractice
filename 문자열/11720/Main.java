import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String f = sc.next();
        int sum = 0;
        for(int i = 0; i<a;i++){
            int b = (int)f.charAt(i)-'0';
            sum += b;
        }
        System.out.println(sum);
        sc.close();
    }
}