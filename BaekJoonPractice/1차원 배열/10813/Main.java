import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 바구니의 개수
        int b = sc.nextInt(); // 공을 바꿀 횟수
        Integer[] arrary = new Integer[a];
        for (int s=0; s<a; s++){
            arrary[s] = s+1;
        }
        int temp = 0;
        for (int x = 0;x < b;x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            temp = arrary[i-1]; 
            arrary[i-1] = arrary[j-1];
            arrary[j-1] = temp;
        }
        for (int m : arrary){
            System.out.print(m+" ");
        }
        
        sc.close();
    }
}