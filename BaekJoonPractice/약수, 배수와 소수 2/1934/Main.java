import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < N; i++) {

            int a = in.nextInt();
            int b = in.nextInt();

            int d = gcd(a, b);	// 최소 공배수 구하기

            sb.append(a * b / d).append('\n');
        }
        System.out.println(sb);
        in.close();
    }

    // 최대공약수 반복문 방식
    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b; // 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }
}