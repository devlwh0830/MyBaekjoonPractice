import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        long a = in.nextLong();
        long b = in.nextLong();

        long d = gcd(a, b);	// 최소 공배수 구하기

        sb.append(a * b / d).append('\n');
        System.out.println(sb);
        in.close();
    }

    // 최대공약수 반복문 방식
    public static long gcd(long a, long b) {

        while (b != 0) {
            long r = a % b; // 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }
}