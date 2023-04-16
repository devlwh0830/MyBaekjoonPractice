import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Float[] arrary = new Float[a]; 
        for (int i = 0 ; i < a; i++){
            Float res = sc.nextFloat();
            arrary[i] = res;
        }
        Arrays.sort(arrary);
        Float max = arrary[arrary.length-1];
        Float sum = 0f;
        for(int j=0;j<a;j++){
            Float aa = arrary[j]/max*100;
            sum += aa;
        }
        System.out.println(sum/a);
        sc.close();
    }
}