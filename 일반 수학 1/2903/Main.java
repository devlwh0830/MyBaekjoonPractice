import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nemo = 2;
        int x = 1;
        int a = sc.nextInt();
        for(int i = 0; i<a;i++){
            nemo = nemo+x;
            x = x*2;
        }
        System.out.print(nemo*nemo);
        sc.close();
    }
}