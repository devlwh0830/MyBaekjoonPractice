import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int[] an = new int[num];
        int cnt = 0;

        for(int i = 0 ; i < arr.length ; i ++)
            an[i] = Integer.parseInt(arr[i]);

        int[] temp = an.clone();

        Arrays.sort(an);

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < an.length ; i++) {
            if(!hmap.containsKey(an[i]))
                hmap.put(an[i], cnt++);
        }

        for(int i = 0; i < num ; i++) {
            sb.append(hmap.get(temp[i])).append(" ");
        }

        System.out.println(sb.toString());
    }
}