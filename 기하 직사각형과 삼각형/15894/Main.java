import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = BigInteger.valueOf(4);
        if (a == BigInteger.valueOf(1)){
            System.out.print(4);
        }else{
            System.out.print(a.multiply(b));
        }
        sc.close();
    }
}