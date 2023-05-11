import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 삼각형 각 1
        int b = sc.nextInt(); // 삼각형 각 2
        int c = sc.nextInt(); // 삼각형 각 3
        if(a+b+c != 180){
            System.out.print("Error");
        } else if (a==60 && b==60 && c==60 && a+b+c == 180) {
            System.out.print("Equilateral");
        } else if (a != b && c != a && c != b && a+b+c == 180) {
            System.out.print("Scalene");
        } else {
            System.out.print("Isosceles");
        }
        sc.close();
    }
}