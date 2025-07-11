import java.io.*;
import java.util.*;

public class Bj_2756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = 0;
            int m = 0;
            for (int i = 0; i < 3; i++) {
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                n += calc(x, y);
            }
            for (int i = 0; i < 3; i++) {
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                m += calc(x, y);
            }

            String res = (n > m) ? "PLAYER 1 WINS." : (n < m) ? "PLAYER 2 WINS." : "TIE.";
            sb.append("SCORE: ").append(n).append(" to ").append(m).append(", ").append(res).append("\n");
        }
        System.out.print(sb);
    }

    private static int calc(double x, double y) {
        int score;
        double xx = x*x;
        double yy = y*y;

        if (xx + yy <= 9) {
            score = 100;
        } else if (xx + yy <= 36) {
            score = 80;
        } else if (xx + yy <= 81) {
            score = 60;
        } else if (xx + yy <= 144) {
            score = 40;
        } else if (xx + yy <= 225) {
            score = 20;
        } else {
            score = 0;
        }

        return score;
    }
}