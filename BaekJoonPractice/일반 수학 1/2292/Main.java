import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 1;
        int d = 1;
        int result = 1;
        if(a == 1){
            System.out.print(1);
        }
        else{
            while(true){
                a = a - c;
                c = 6 * d++;
                if(a-c <= 0){
                    break;
                }
                result++;
            }
            System.out.print(result+1);
        }
        sc.close();
    }
}