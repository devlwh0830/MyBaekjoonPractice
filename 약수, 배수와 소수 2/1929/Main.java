import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");

        for (int i = Integer.parseInt(a[0]); i <= Integer.parseInt(a[1]); i++) {
            var bi = new BigInteger(String.valueOf(i));

            if (bi.isProbablePrime(10)) {
                System.out.println(i);
            }
        }

        br.close();
    }
}