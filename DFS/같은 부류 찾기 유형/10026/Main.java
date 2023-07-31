import java.io.*;
import java.util.*;
public class Main {

    final static int MAX = 100 + 10;
    static int[][] map1;
    static int[][] map2;
    static boolean[][] visited1;
    static boolean[][] visited2;
    static int N, M;
    static int cnt;
    static int[] dirX = {1,0,0,-1};
    static int[] dirY = {0,1,-1,0};
    static ArrayList<Integer> arrayList;

    static void dfs1(int y, int x){
        visited1[y][x] = true;
        for(int i=0;i<4;i++){
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if(map1[newY][newX]==map1[y][x] && !visited1[newY][newX]){
                dfs1(newY,newX);
            }
        }
    }
    
    static void dfs2(int y, int x){
        visited2[y][x] = true;
        for(int i=0;i<4;i++){
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if(map2[newY][newX]==map2[y][x] && !visited2[newY][newX]){
                dfs2(newY,newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map1 = new int[MAX][MAX];
        map2 = new int[MAX][MAX];
        visited1 = new boolean[MAX][MAX];
        visited2 = new boolean[MAX][MAX];

        // 1. map에 연결 정보 채우기
        for(int i=1; i<=N; i++) {
            String str = br.readLine();
            for(int j=1; j<=N; j++) {
                if(str.charAt(j-1)=='R'){
                    map1[i][j] = 1;
                }
                if(str.charAt(j-1)=='G'){
                    map1[i][j] = 2;
                }
                if(str.charAt(j-1)=='B'){
                    map1[i][j] = 3;
                }
            }
            for(int j=1; j<=N; j++) {
                if(str.charAt(j-1)=='R'){
                    map2[i][j] = 1;
                }
                if(str.charAt(j-1)=='G'){
                    map2[i][j] = 1;
                }
                if(str.charAt(j-1)=='B'){
                    map2[i][j] = 3;
                }
            }
        }
        // 2. DFS 구현
        int answer1 = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(map1[i][j]==1 && !visited1[i][j]){
                    answer1++;
                    dfs1(i,j);
                }
                if(map1[i][j]==2 && !visited1[i][j]){
                    answer1++;
                    dfs1(i,j);
                }
                if(map1[i][j]==3 && !visited1[i][j]){
                    answer1++;
                    dfs1(i,j);
                }
            }
        }

        int answer2 = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(map2[i][j]==1 && !visited2[i][j]){
                    answer2++;
                    dfs2(i,j);
                }
                if(map2[i][j]==3 && !visited2[i][j]){
                    answer2++;
                    dfs2(i,j);
                }
            }
        }

        // 3. 출력
        bw.write((answer1)+" "+(answer2));

        br.close();
        bw.close();
    }
}