import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> HashSet = new HashSet<>();

        String[] N = br.readLine().split(" ");

        for(int i = 0; i < Integer.parseInt(N[0]); i++) {
            String key = br.readLine();
            HashSet.add(key);
        }

        ArrayList<String> lists = new ArrayList<>();
        for(int i = 0; i < Integer.parseInt(N[1]); i++) {
            String key = br.readLine();
            if(HashSet.contains(key)){
                lists.add(key);
            
            }
        }

        Collections.sort(lists);

        System.out.println(lists.size());
        for(var li : lists) {
            System.out.println(li + " ");
        }

    }
}