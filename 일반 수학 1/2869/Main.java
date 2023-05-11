import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 2
        int b = sc.nextInt(); // 1
        int c = sc.nextInt(); // 5
        if ((c-b)%(a-b)!=0){ // 4%1
            System.out.print((c-b)/(a-b)+1); 
        }
        else{
            System.out.print((c-b)/(a-b));
        }
        sc.close();
    }
}