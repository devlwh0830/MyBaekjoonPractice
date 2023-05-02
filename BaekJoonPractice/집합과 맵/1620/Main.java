import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String [] arr = new String[N+1];
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            arr[i] = br.readLine();
            hashMap.put(arr[i],i);
        }
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(isNumber(s)){
                int i1 = Integer.parseInt(s);
                System.out.println(arr[i1]);
            }else{
                System.out.println(hashMap.get(s));
            }
        }
    }
    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}