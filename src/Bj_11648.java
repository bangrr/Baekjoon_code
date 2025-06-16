import java.io.*;

public class Bj_11648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<=9; i++) {
            if (n < 10) {
                System.out.print(i);
                return;
            }

            int res = 1;
            while (n > 0) {
                res *= (n%10);
                n /= 10;
            }
            n = res;
        }
    }
}