import java.io.*;

public class Bj_4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String lower = str.toLowerCase();
            int cnt = 0;
            for (int j=0; j<lower.length(); j++) {
                char ch = lower.charAt(j);
                if (ch == 'g') {
                    cnt++;
                } else if (ch == 'b') {
                    cnt--;
                }
            }
            sb.append(str).append(" is ").append(cnt > 0 ? "GOOD" : cnt < 0 ? "A BADDY" : "NEUTRAL").append("\n");
        }
        System.out.print(sb);
    }
}