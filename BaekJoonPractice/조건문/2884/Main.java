import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M-45 < 0){
            int a = M-45;
            H = H - 1;
            if (H == -1){ H = 23;}
            M = 60 + a;
            System.out.println(H+" "+M);
        }
        else{
            M = M-45;
            System.out.println(H+" "+M);
        }
        sc.close();
    }
}
