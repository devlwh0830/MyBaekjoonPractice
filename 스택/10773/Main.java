import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(bf.readLine());
            if(b!=0){
                arrayList.add(b);
                sum += b;
            }else{
                sum -= arrayList.get(arrayList.size()-1);
                arrayList.remove(arrayList.size()-1);
            }
        }
        System.out.println(sum);
        bf.close();
    }
}