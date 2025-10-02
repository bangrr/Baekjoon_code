public class Bj_34509 {
    public static void main(String[] args) {
        for (int i=10; i<=99; i++) {
            int tmp = i%10*10 + i/10;

            if (((i/10 + i%10) % 6 == 0) && (tmp % 4 == 0) && (i/10 != 8 && i%10 != 8)) {
                System.out.print(i);
                return;
            }
        }
    }
}