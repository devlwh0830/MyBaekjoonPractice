import java.util.Objects;
import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) { // 2022년 시도상업경진대회 비지니스 프로그래밍 7번 문제
//        long starts = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer[][] list = new Integer[2][a];
        Integer[][] lists = new Integer[2][a];
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            list[0][i] = b;
            list[1][i] = c;
        }
        int start = list[1][0];
        lists[0][0] = list[0][0];
        lists[1][0] = list[1][0];
        int cnt =0;
        int count = 1;
        while(true){
            if(cnt == a){
                break;
            }
            for (int i = 0; i < a - 1; i++) {
                for (int j = 0; j < 2; j++) {
                    if (start == list[j][i + 1]) {
                        if (start == list[1][i + 1]) {
                            start = list[0][i+1];
                            lists[0][count] = list[1][i+1];
                            lists[1][count] = list[0][i+1];
                            list[0][i+1] = 0;
                            list[1][i+1] = 0;
                        }else{
                            start = list[1][i+1];
                            lists[0][count] = list[0][i+1];
                            lists[1][count] = list[1][i+1];
                            list[0][i+1] = 0;
                            list[1][i+1] = 0;
                        }
                        count++;
                    }
                }
            }
            cnt++;
        }
        if(count != a || !Objects.equals(lists[0][0], lists[1][a - 1])){
            System.out.println("impossible");
        }else{
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(lists[j][i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
//        long end = System.currentTimeMillis();
//        System.out.println("실행시간 : " + (end - starts)/1000.0);
    }
}