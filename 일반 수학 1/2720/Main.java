import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,s,d;
        // 쿼터(Quarter, $0.25) -> 25
        // 다임(Dime, $0.10) -> 10
        // 니켈(Nickel, $0.05) -> 5
        // 페니(Penny, $0.01) -> 1

        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            x = b/25;
            int x1 = b%25;
            y = x1/10;
            int x2 = x1%10;
            s = x2/5;
            int x3 = x2%5;
            d = x3%5;
            System.out.println(x+" " + y + " " + s + " " + d);
        }
        sc.close();
    }
}