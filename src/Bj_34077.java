import java.io.*;

public class Bj_34077 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int idx = -1;
            for (int i = n * 2; i >= 0; i--) {
                if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                    idx = i;
                    break;
                }
            }
            s = s.substring(0, idx+1);

            idx = s.indexOf("-");
            if (idx < 0 || idx == s.length()-2) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}