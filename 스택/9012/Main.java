import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        ArrayList<String> arrayList = new ArrayList<>();
        int a = Integer.parseInt(bf.readLine());
        boolean result = true;
        for (int i = 0; i < a; i++) {
            String b = bf.readLine();
            for(int j=0;j<b.length();j++){
                if(b.charAt(j) == '('){
                    arrayList.add("(");
                }else{
                    if (arrayList.size() - 1 == -1) {
                        result = false;
                    }else{
                        arrayList.remove(arrayList.size()-1);
                    }
                }
            }
            if(arrayList.size() == 0  && result) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            arrayList.clear();
            result = true;
        }
        bf.close();
    }
}