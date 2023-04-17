<<<<<<< HEAD
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrary = new String[10];

        for (int s=0; s<10; s++){
            String a = sc.nextLine();
            int b = Integer.valueOf(a)%42;
            arrary[s] = String.valueOf(b);
        }

        // 배열을 HashSet으로 변환
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arrary));

        // HashSet을 배열로 변환
        String[] resultArr = hashSet.toArray(new String[0]);

        // Dup이 제거된 배열 출력
        System.out.println(resultArr.length); // 4
        sc.close();
    }
=======
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrary = new String[10];

        for (int s=0; s<10; s++){
            String a = sc.nextLine();
            int b = Integer.valueOf(a)%42;
            arrary[s] = String.valueOf(b);
        }

        // 배열을 HashSet으로 변환
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arrary));

        // HashSet을 배열로 변환
        String[] resultArr = hashSet.toArray(new String[0]);

        // Dup이 제거된 배열 출력
        System.out.println(resultArr.length); // 4
        sc.close();
    }
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
}