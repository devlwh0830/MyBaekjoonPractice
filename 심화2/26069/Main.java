import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("ChongChong");
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String a = sc.nextLine();
            String[] b = a.split(" ");

            if(hashSet.contains(b[0])){
                hashSet.add(b[1]);
            } else if (hashSet.contains(b[1])) {
                hashSet.add(b[0]);
            }
        }
        System.out.println(hashSet.size());
        sc.close();
    }
}