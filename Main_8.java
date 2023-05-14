import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) { // 2022년 시도상업경진대회 비지니스 프로그래밍 8번 문제
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //선의 개수
        int b = 0;
        int cnt = 1;
        for(int i=1;i<=n;i++){
            b = i*(i-1)/2; // 교차점의 개수
            cnt++;
        }
        System.out.println(b+cnt);
        sc.close();
    }
}
