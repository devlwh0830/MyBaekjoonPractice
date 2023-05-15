import java.util.Arrays;
import java.util.Scanner;
public class Main_6 { // 2022년 시도상업경진대회 비지니스 프로그래밍 6번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] list = new Integer[N];
        for(int i=0;i<N;i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        Integer[] result = new Integer[N-1];
        int sum = 0;
        int ex = list[0] + list[1];
        result[0] = ex;
        for(int i=1; i<N-1; i++){
            ex = list[i+1] + ex;
            result[i] = ex;
        }
        for(int j:result){
            sum += j;
        }
        System.out.println(sum);
        sc.close();
    }
}