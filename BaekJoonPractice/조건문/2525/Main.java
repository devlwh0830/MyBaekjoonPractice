<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        if (M+C >= 60){
            int a = (M+C)%60;
            int b = (M+C)/60;
            H = H + b;
            if( H >= 24){H = H%24;}
            M = a;
            System.out.println(H+" "+M);
        }
        else{
            M = M+C;
            System.out.println(H+" "+M);
        }
        sc.close();
    }
}
=======
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        if (M+C >= 60){
            int a = (M+C)%60;
            int b = (M+C)/60;
            H = H + b;
            if( H >= 24){H = H%24;}
            M = a;
            System.out.println(H+" "+M);
        }
        else{
            M = M+C;
            System.out.println(H+" "+M);
        }
        sc.close();
    }
}
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
