import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = Integer.parseInt(bf.readLine());
        for (int i = 0; i < a; i++) {
            String b = bf.readLine();
            if (b.contains("push")) {
                String[] c = b.split(" ");
                arrayList.add(Integer.parseInt(c[1]));
            }
            if (b.contains("pop")) {
                try {
                    System.out.println(arrayList.get(arrayList.size() - 1));
                    arrayList.remove(arrayList.size() - 1);
                } catch (Exception e) {
                    System.out.println(-1);
                }
            }
            if (b.contains("size")) {
                try {
                    System.out.println(arrayList.size());
                } catch (Exception e) {
                    System.out.println(0);
                }
            }
            if (b.contains("empty")) {
                if (arrayList.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            if (b.contains("top")) {
                if (arrayList.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(arrayList.get(arrayList.size() - 1));
                }
            }
        }
        bf.close();
    }
}