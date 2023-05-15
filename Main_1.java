import java.util.*;

public class Main_1 { // 2022년 상업 경진대회 1번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        float totaldistance = 0;
        float totaltime = 0;
        sc.nextLine();
        for(int i=0;i<Integer.parseInt(a);i++){
            float input = sc.nextFloat();
            String inputs = sc.next();
            String[] time = inputs.split(":");
            float times = Integer.parseInt(time[0]) * 3600;
            times = times + Integer.parseInt(time[1]) * 60;
            times = times + Integer.parseInt(time[2]);
            totaltime = totaltime + times;
            totaldistance = totaldistance + input * times; // 이동거리계산
        }

        System.out.println(Math.round(totaldistance / totaltime * 100) / 100.0);
        sc.close();
    }
}