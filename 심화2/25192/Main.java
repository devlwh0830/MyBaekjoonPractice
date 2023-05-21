import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Set<String> HashSet = new HashSet<String>();
        int sum = 0;
        for(int i=0;i<a;i++){
            String b = sc.next();
            if(!Objects.equals(b, "ENTER")){
                HashSet.add(b);
            }
            if(Objects.equals(b, "ENTER")){
                sum = sum + HashSet.size();
                HashSet.clear();
            }
        }
        System.out.println(sum +  HashSet.size());
        sc.close();
    }
}
