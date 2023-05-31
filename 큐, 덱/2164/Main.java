import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Deque<Integer> q = new LinkedList<>();
        for(int i=0;i<a;i++){
            q.offer(i+1);
        }
        while(true){
            if(q.size() == 1){
                break;
            }
            q.poll();
            Integer item = q.getFirst();
            q.poll();
            q.offer(item);
        }
        System.out.println(q.getFirst());
        sc.close();
    }
}
