import java.io.*;
import java.util.*;

public class Main {
    final static int MAX = 1000*10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;
        for(int i=1;i<=N;i++){
            if(visited[i]==false && graph[idx][i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 1. graph에 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        // 2. dfs(재귀함수 호출)
        for(int i=1;i<=N;i++){
            if(visited[i] == false){
                dfs(i);
                answer++;
            }
        }

        // 3. 출력
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}