import java.io.*;

public class Bj_10181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = "6 = 1 + 2 + 3";
        String b = "28 = 1 + 2 + 4 + 7 + 14";
        String c = "496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248";
        String d = "8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064";

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            if (n == 6) {
                sb.append(a).append("\n");
            } else if (n == 28) {
                sb.append(b).append("\n");
            } else if (n == 496) {
                sb.append(c).append("\n");
            } else if (n == 8128) {
                sb.append(d).append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        System.out.print(sb);
    }
}