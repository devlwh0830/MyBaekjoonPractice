import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 분자
        int b = sc.nextInt(); // 분모
        int c = sc.nextInt(); // 분자
        int d = sc.nextInt(); // 분모
        int son = d*a + c*b;
        int mom = b*d;
        int gcd= getGcd(son,mom); //최대공약수를 구해준다.

        System.out.println(son/gcd+" "+mom/gcd); //기약분수 출력
        sc.close();
    }//main

    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}