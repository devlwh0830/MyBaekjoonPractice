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
            for(int x=1; x<i; x++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=T;i>=0;i--){
            for(int j = i; j<=T; j++){
                System.out.print(" ");
            }
            for(int s=1; s<i-1; s++){
                System.out.print("*");
            }
            for(int x=1; x<i; x++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}