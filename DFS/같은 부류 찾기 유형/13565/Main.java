import java.io.*;
import java.util.*;

public class Main {

    final static int MAX = 1000 + 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int N, M;
    static boolean answer;
    static int[] dirX = {-1,1,0,0};
    static int[] dirY = {0,0,-1,1};

    static void dfs(int y, int x){
        if(y==N-1){
            answer = true;
            return;
        }
        visited[y][x] = true;
        for(int i=0;i<4;i++){
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if(map[newY][newX] && !visited[newY][newX]){
                dfs(newY,newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];

        // 1. map에 연결 정보 채우기
        for(int i=1;i<=N;i++){
            String str = br.readLine();
            for(int j=1;j<=M;j++){
                map[i][j] = (str.charAt(j-1) == '0') ? true : false;
            }
        }

        // 2. DFS 구현
        for(int j=1;j<=M;j++){
            if(map[1][j]){
                dfs(1,j);
            }
        }

        // 3. 출력
        if(answer) bw.write("YES");
        else bw.write("NO");

        br.close();
        bw.close();
    }
}