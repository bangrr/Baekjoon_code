import java.io.*;

public class Bj_11091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            boolean[] arr = new boolean[26];
            String s = br.readLine().toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    arr[s.charAt(i) - 'a'] = true;
                }
            }
            StringBuilder tmp = new StringBuilder();
            tmp.append("missing ");
            for (int i = 0; i < 26; i++) {
                if (!arr[i]) {
                    tmp.append((char) (i + 'a'));
                }
            }
            sb.append(tmp.length() > 8 ? tmp.toString() : "pangram").append("\n");
        }
        System.out.print(sb);
    }
}