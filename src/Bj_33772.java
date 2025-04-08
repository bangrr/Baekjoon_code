import java.io.*;

public class Bj_33772 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine() + ".";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '\\') {
                if (s.charAt(i + 4) == '.') {
                    sb.append('v');
                    i += 4;
                } else {
                    sb.append('w');
                    i += 8;
                }
            }
        }
        System.out.print(sb);
    }
}