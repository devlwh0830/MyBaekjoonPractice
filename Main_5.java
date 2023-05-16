import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) { // 2022년 시도상업경진대회 비지니스 프로그래밍 5번 문제
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer,String> in = new HashMap<Integer,String>();
        HashMap<Integer,String> out = new HashMap<Integer,String>();
        int sum = 0;
        String start20 = "0";
        String end20 = "0";
        int result20 = 0;
        for(int i=0;i<N; i++){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            if(Objects.equals(a, "in")){
                in.put(Integer.parseInt(b),c);
                sum = sum + Integer.parseInt(b);
                if(sum > 20){
                    if(Objects.equals(start20, "0")){
                        start20 = c;
                    }
                }
            }
            if(Objects.equals(a, "out")){
                out.put(Integer.parseInt(b),c);
                sum = sum - Integer.parseInt(b);
                if(sum <= 20){
                    if(Objects.equals(end20, "0")){
                        end20 = c;
                    }
                }
            }
            if(!Objects.equals(start20, "0") && !end20.equals("0")){
                String[] start_time20 = start20.split(":");
                String[] end_time20 = end20.split(":");
                int hour20 = (Integer.parseInt(end_time20[0]) - Integer.parseInt(start_time20[0])) * 60;
                int min20 = Integer.parseInt(end_time20[1]) - Integer.parseInt(start_time20[1]);
                result20 = result20 + (hour20+min20)*10000;
                start20 = "0";
                end20 = "0";
            }
        }
        int result = result20;
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
