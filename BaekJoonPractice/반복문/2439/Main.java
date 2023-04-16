import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
            for(int j = T-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            System.out.print("\n");
;        }
        sc.close();
    }
}