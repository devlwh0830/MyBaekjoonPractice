import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        HashMap<String,String> map1 = new HashMap<String,String>(); //HashMap생성
        for(int i=0;i<a;i++){
            String[] b = br.readLine().split(" ");
            if(map1.containsKey(b[0])){
                if (Objects.equals(b[1], "leave")){
                    map1.remove(b[0]);
                }
            } else{
                map1.put(b[0],b[1]);
            }
        }
        ArrayList<String> list = new ArrayList<String>(map1.keySet());
        list.sort(Collections.reverseOrder());

        for(var li : list) {
            System.out.println(li + " ");
        }
        bw.flush();
        bw.close();
    }
}