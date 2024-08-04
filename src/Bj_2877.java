import java.io.*;

public class Bj_2877 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int t = 1;
        while (true) {
            if (t > n+1) {
                t /= 2;
                break;
            }
            t *= 2;
        }
        int k = n+1-t;

        t /= 2;
        while (t >= 1) {
            if (k >= t) {
                sb.append("7");
                k -= t;
            } else {
                sb.append("4");
            }
            t /= 2;
        }
        System.out.print(sb);
    }
}