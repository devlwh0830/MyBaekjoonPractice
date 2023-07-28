import java.io.*;
import java.util.*;

public class Main {
    
    final static int MAX = 100000+10;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int[] answer;
    static int N;

    public static void dfs(int idx){
        visited[idx] = true;
        for(int i=0;i<graph[idx].size();i++){
            int next = graph[idx].get(i);
            if(!visited[next]){
                answer[next] = idx;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        // 1. graph에 연결 정보 채우기
        graph = new ArrayList[MAX];
        for(int i=1;i<=N;i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];

        for(int i=0;i<N-1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        // 2. dfs(재귀함수 호출)
        dfs(1);

        // 3. 출력
        for(int i=2;i<=N;i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}