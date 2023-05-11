public class Main {
    public static void main(String[] args) {
        // 유클리드 호제법
        // 두 수의 최대공약수를 구하는 알고리즘
        int a = getGcd(345, 273);
        System.out.println(a);
    }
    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
