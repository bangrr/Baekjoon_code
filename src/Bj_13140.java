import java.io.*;

public class Bj_13140 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int d = 0; d < 10; d++) {
            for (int e = 0; e < 10; e++) {
                if (e == d) continue;
                for (int h = 1; h < 10; h++) {
                    if (h == d || h == e) continue;
                    for (int l = 0; l < 10; l++) {
                        if (l == d || l == e || l == h) continue;
                        for (int o = 0; o < 10; o++) {
                            if (o == d || o == e || o == h || o == l) continue;
                            for (int r = 0; r < 10; r++) {
                                if (r == d || r == e || r == h || r == l || r == o) continue;
                                for (int w = 1; w < 10; w++) {
                                    if (w == d || w == e || w == h || w == l || w == o || w == r) continue;
                                    int a = h * 10000 + e * 1000 + l * 100 + l * 10 + o;
                                    int b = w * 10000 + o * 1000 + r * 100 + l * 10 + d;
                                    if (n == a + b) {
                                        sb.append("  ").append(a).append("\n");
                                        sb.append("+ ").append(b).append("\n");
                                        sb.append("-------\n");
                                        sb.append(" ".repeat(7-String.valueOf(n).length())).append(n);
                                        System.out.print(sb);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("No Answer");
    }
}