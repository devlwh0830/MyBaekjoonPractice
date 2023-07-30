import java.io.*;
import java.util.*;

public class Main {

    final static int MAX = 50 + 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int N, M;
    static int[] dirX = {-1,-1,1,1,0,0,-1,1};
    static int[] dirY = {1,-1,-1,1,-1,1,0,0};

    static void dfs(int y, int x){
        visited[y][x] = true;
        for(int i=0;i<8;i++){
            int newY = dirY[i] + y;
            int newX = dirX[i] + x;
            if(map[newY][newX] && !visited[newY][newX]){
                dfs(newY,newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = " ";
        while( !(str = br.readLine()).equals("0 0") ){
            st = new StringTokenizer(str);

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            map = new boolean[MAX][MAX];
            visited = new boolean[MAX][MAX];

            // 1. map에 연결 정보 채우기
            for(int i=1; i<=N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=1; j<=M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken())==1;
                }
            }

            // 2. DFS 구현
            int answer = 0;
            for(int i=1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    if(map[i][j] && !visited[i][j]){
                        dfs(i,j);
                        answer++;
                    }
                }
            }

            // 3. 출력
            bw.write(String.valueOf(answer));
            bw.newLine();
        }
        
        br.close();
        bw.close();
    }
}