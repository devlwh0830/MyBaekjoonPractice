import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        ArrayList<String> arrayList = new ArrayList<>();
        boolean result = true;
        while(true){
            String b = bf.readLine();
            if (Objects.equals(b, ".")){
                break;
            }
            for(int j=0;j<b.length();j++){
                if(b.charAt(j) == '('){
                    arrayList.add("(");
                }
                if (b.charAt(j) == '[') {
                    arrayList.add("[");
                }
                if (b.charAt(j) == ']'){
                    if (arrayList.size() - 1 == -1) {
                        result = false;
                    }else{
                        if (Objects.equals(arrayList.get(arrayList.size() - 1), "[")){
                            arrayList.remove(arrayList.size() - 1);
                        }else{
                            result = false;
                        }
                    }
                }
                if (b.charAt(j) == ')'){
                    if (arrayList.size() - 1 == -1) {
                        result = false;
                    }else{
                        if (Objects.equals(arrayList.get(arrayList.size() - 1), "(")){
                            arrayList.remove(arrayList.size() - 1);
                        }else{
                            result = false;
                        }
                    }
                }
            }
            if(arrayList.size() == 0 && result) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            arrayList.clear();
            result = true;
        }
        bf.close();
    }
}