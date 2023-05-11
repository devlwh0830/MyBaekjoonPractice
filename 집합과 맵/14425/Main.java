import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<String> set1 = new HashSet<>();
        for(int i =0;i<a;i++){
            set1.add(br.readLine());
        }
        int sum = 0;
        for(int i =0;i<b;i++){
            String f = br.readLine();
            if(set1.contains(f)){
                sum++;
            }
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }
}