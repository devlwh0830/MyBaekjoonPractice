import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] list = {};

        for(int j=0;j<10;j++){
            list[j] = j+1;
        }
        
        for(int i=0;i<b;i++){
            int x = sc.nextInt(); // 시작
            int y = sc.nextInt(); // 끝
            int m = sc.nextInt(); // 중간값
        }

        sc.close();
    }
}