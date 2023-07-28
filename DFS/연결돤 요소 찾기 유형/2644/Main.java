import java.io.*;
import java.util.*;
public class Main {
    final static int MAX = 100+10;
    static boolean[] visited;
    static boolean[][] graph;
    static int N, M, start, end, answer;

    public static void dfs(int idx,int count){
        visited[idx] = true;
        if(idx == end){
            answer = count;
            return;
        }
        for(int i=1;i<=N;i++){
            if(graph[idx][i] && !visited[i]){
                dfs(i,count+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        // 1. graph에 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = -1;

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. dfs(재귀함수 호출)
        dfs(start,0);

        // 3. 출력
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}