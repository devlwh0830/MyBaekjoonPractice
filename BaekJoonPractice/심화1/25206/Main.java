import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float kl = 0;
        String[][] list = {
                {"A+", "4.5"},
                {"A0", "4.0"},
                {"B+", "3.5"},
                {"B0", "3.0"},
                {"C+", "2.5"},
                {"C0", "2.0"},
                {"D+", "1.5"},
                {"D0", "1.0"},
                {"F", "0.0"}
        };

        for (int i = 0; i < 20; i++) {
            String a = sc.nextLine();
            String[] array = a.split(" ");
            for (int j = 0; j < 9; j++) { // 학점 * 과목평점
                float k = 0; // k 변수 선언
                float l = 0; // l 변수 선언
                if (Objects.equals(list[j][0], array[2])) {
                    k = Float.parseFloat(list[j][1]); // k 변수에 형변환하여 대입
                    l = Float.parseFloat(array[1]); // l 변수에 형변환하여 대입
                    kl += k * l; // k와 l을 곱하고 kl에 계속 더함
                }
            }
            for (int h = 0; h < 9; h++) { // 학점의 총합 구하는 반복문
                if (Objects.equals(list[h][0], array[2])) { // 조건문으로 검수
                    sum += Float.parseFloat(array[1]);
                }
            }
        }
        boolean yes = Double.isNaN(kl / sum); // kl 값에 sum 값을 나눈다.
        if (yes){
            System.out.println("0.000000"); // 만약 NaN이면 0.000000으로 출력
        }else {
            System.out.println(kl/sum); // 아니라면 나눈 값을 출력
        }
        sc.close();
    }
}