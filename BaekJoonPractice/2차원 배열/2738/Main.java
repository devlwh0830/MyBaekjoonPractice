import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer[][] listA = new Integer[a][b];
        Integer[][] listB = new Integer[a][b];
        Integer[][] result = new Integer[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                listA[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                listB[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                result[i][j] = listA[i][j] + listB[i][j];
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}