import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        for(int i=0;i<3;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a;
            arr2[i] = b;
        }
        Set<Integer> dup = new HashSet<>();
        Set<Integer> noDup = new HashSet<>();
        for (int i = 0 ; i < arr.length ; ++i) {
            if (dup.contains(arr[i])) {
                noDup.remove(arr[i]);
            } else {
                noDup.add(arr[i]);
            }
            dup.add(arr[i]);
        }
        System.out.print(noDup.hashCode()+" ");

        Set<Integer> dup1 = new HashSet<>();
        Set<Integer> noDup1 = new HashSet<>();
        for (int i = 0 ; i < arr2.length ; ++i) {
            if (dup1.contains(arr2[i])) {
                noDup1.remove(arr2[i]);
            } else {
                noDup1.add(arr2[i]);
            }
            dup1.add(arr2[i]);
        }
        System.out.print(noDup1.hashCode()+" ");
        sc.close();
    }
}