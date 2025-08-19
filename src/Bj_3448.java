import java.io.*;

public class Bj_3448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s;
            int sum = 0;
            int cnt = 0;
            while ((s = br.readLine()) != null) {
                sum += s.length();
                if (s.isEmpty()) {
                    break;
                }
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '#') {
                        cnt++;
                    }
                }
            }

            String sff = String.format("%.1f", 100 - (double) cnt / sum * 100);

            sb.append("Efficiency ratio is ");
            if (sff.endsWith(".0")) {
                sb.append(Integer.parseInt(sff.substring(0, sff.length()-2)));
            } else {
                sb.append(sff);
            }
            sb.append("%.\n");
        }
        System.out.print(sb);
    }
}