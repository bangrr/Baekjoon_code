import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bj_11319 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("[aeiouAEIOU]");

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine().replaceAll(" ", "");
            Matcher matcher = pattern.matcher(s);
            int cnt = 0;
            while (matcher.find()) {
                cnt++;
            }
            sb.append(s.length() - cnt).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}