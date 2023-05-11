import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        for(int i=-999;i<=999;i++){
            for(int j=-999;j<=999;j++){
                if(x1*i + y1*j == r1) {
                    if(x2*i + y2*j == r2) {
                        System.out.print(i+" "+j);
                        break;
                    }
                }
            }
        }

        sc.close();
    }
}