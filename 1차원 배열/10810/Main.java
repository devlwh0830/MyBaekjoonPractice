import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 바구니의 개수
        int b = sc.nextInt(); // 공을 넣을 횟수
        Integer[] arrary = new Integer[a];
        for (int s = 0; s<b;s++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int n = i-1;n<=j-1;n++){
                arrary[n] = k;
            }
        }
        for (int x = 0;x<=a-1;x++){
            if (arrary[x] == null){
                arrary[x] = 0;
            }
        }
        for (int m : arrary){
            System.out.print(m+" ");
        }
        
        sc.close();
    }
}