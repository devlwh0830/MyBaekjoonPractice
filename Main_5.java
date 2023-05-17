import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) { // 2022년 시도상업경진대회 비지니스 프로그래밍 5번 문제
        // 예제는 맞게 나오지만 완벽하지는 않음!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer,String> in = new HashMap<Integer,String>();
        HashMap<Integer,String> out = new HashMap<Integer,String>();
        for(int i=0;i<N; i++){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            if(Objects.equals(a, "in")){
                in.put(Integer.parseInt(b),c);
            }
            if(Objects.equals(a, "out")) {
                out.put(Integer.parseInt(b), c);
            }
        }
        int result = 0;
        for(Integer i: in.keySet()){
            if(i > 4){
                String start = in.get(i);
                String end = out.get(i);
                String[] start_time = start.split(":");
                String[] end_time = end.split(":");
                int hour = (Integer.parseInt(end_time[0]) - Integer.parseInt(start_time[0])) * 60;
                int min = Integer.parseInt(end_time[1]) - Integer.parseInt(start_time[1]);
                result = result + (hour+min)*10000;
            }
        }
        System.out.println(result);
        sc.close();
    }
}