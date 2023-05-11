import java.util.Objects;
import java.util.Scanner;
public class Main { // 2022년 시도상업경진대회 비지니스 프로그래밍 2번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[][] result = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result[i][j] = "0";
            }
        }
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            String xy = sc.next();
            int x = xy.charAt(1) - '0';
            int y = xy.charAt(3) - '0';
            for (int k = 0; k < a; k++) {
                for (int d = 0; d < b; d++) {
                    if (k == x && d == y) {
                        result[d][k] = "X";
                    }
                }
            }
        }
        int[] dx = { -1, 0, 1, 0 , -1, 1,-1, 1};
        int[] dy = { 0, 1, 0 ,-1, -1, 1, 1, -1};

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int sum = 0;
                if(!Objects.equals(result[i][j], "X")){
                    for (int k = 0; k < 8; k++) {
                        if ((i + dx[k]) >= 0 && (j + dy[k]) >= 0 && (i + dx[k]) <= a-1 && (j + dy[k]) <= b-1) {
                            if(Objects.equals(result[i + dx[k]][j + dy[k]], "X")){
                                sum++;
                            }
                        }
                    }
                    result[i][j] = String.valueOf(sum);
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}