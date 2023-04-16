import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c && a == c){
            System.out.println(10000 + a * 1000);
        } else if (a == b && b != c){
            System.out.println(1000 + a * 100);
        }else if (a != b && b == c){
            System.out.println(1000 + b * 100);
        }else if (a == c && b != c){
            System.out.println(1000 + c * 100);
        } else{
            int[] positiveNumbers = {a, b, c};
            int max = 0;
            for(int number : positiveNumbers){
                max = Math.max(max, number);
            }
            System.out.println(max * 100);
        }
        sc.close();
    }
}
