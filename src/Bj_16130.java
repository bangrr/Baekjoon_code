import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_16130 {
    private static final StringBuilder sb = new StringBuilder();

    private static final String MG = "(weapon)";
    private static final String YG = "(09)";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            solve(br.readLine()).append("\n");
        }
        System.out.print(sb);
    }

    private static StringBuilder solve(String s) {
        int len = s.length();
        int sum = 0;
        int prev = 0;

        int a = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int num = (c < 65) ? c - 48 : c - 55;
            sum += num;
            int cur = sum / 10;
            if (cur > prev) {
                if (cur < 4) {
                    a += cur;
                    prev = cur;
                } else {
                    return sb.append(a).append((cur == 4) ? MG : YG);
                }
            }
        }
        return sb.append(a);
    }
}
