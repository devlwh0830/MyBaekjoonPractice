import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] list = new Integer[100][100];
        int sum = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                list[i][j] = 0;
            }
        }
        int x = sc.nextInt();
        for(int h=0;h<x;h++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=a;i<a+10;i++){
                for(int j=b;j<b+10;j++){
                    list[i][j] = 1;
                }
            }
        }
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                sum += list[i][j];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}