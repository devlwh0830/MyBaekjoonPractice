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
                float k = 0;
                float l = 0;
                if (Objects.equals(list[j][0], array[2])) {
                    k = Float.parseFloat(list[j][1]);
                    l = Float.parseFloat(array[1]);
                    kl += k * l;
                }
            }
            for (int h = 0; h < 9; h++) { // 학점의 총합
                if (Objects.equals(list[h][0], array[2])) {
                    sum += Float.parseFloat(array[1]);
                }
            }
        }
        boolean yes = Double.isNaN(kl / sum);
        if (yes){
            System.out.println("0.000000");
        }else {
            System.out.println(kl/sum);
        }
        sc.close();
    }
}