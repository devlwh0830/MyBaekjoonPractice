import java.util.*;

public class Main {
    public static <AStream> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer[] list1 = new Integer[a];
        Integer[] list2 = new Integer[a];
        for(int i = 0;i<a;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list1[i] = x;
            list2[i] = y;
        }
        if(a!=0){
            Arrays.sort(list1);
            Arrays.sort(list2);

            System.out.print((list1[list1.length-1]-list1[0])*(list2[list2.length-1]-list2[0]));
        }else{
            System.out.print(0);
        }

        sc.close();
    }
}