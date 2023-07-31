import java.io.*;
import java.util.*;
public class Main {

    final static int MAX = 25 + 10;
    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int cnt;
    static int[] dirX = {1,0,0,-1};
    static int[] dirY = {0,1,-1,0};
    static ArrayList<Integer> arrayList;

    static void dfs(int y, int x){
        visited[y][x] = true;
        cnt++;
        for(int i=0;i<4;i++){
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if(map[newY][newX]==1 && !visited[newY][newX]){
                dfs(newY,newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];

        // 1. map에 연결 정보 채우기
        for(int i=1; i<=N; i++) {
            String str = br.readLine();
            for(int j=1; j<=N; j++) {
                map[i][j] = str.charAt(j - 1)=='1'?1:0;
            }
        }
        arrayList = new ArrayList<>();
        // 2. DFS 구현
        int answer = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(map[i][j]==1 && !visited[i][j]){
                    answer++;
                    dfs(i,j);
                    arrayList.add(cnt);
                    cnt=0;
                }
            }
        }

        // 3. 출력
        Collections.sort(arrayList);
        bw.write(String.valueOf(answer));
        bw.newLine();
        for(int i=0;i<arrayList.size();i++){
            bw.write(String.valueOf(arrayList.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}