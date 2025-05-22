import java.io.*;

public class Bj_33869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[26];
        String w = br.readLine();
        for (int i=0; i<w.length(); i++) {
            char c = w.charAt(i);
            int p = c-'A';
            if (!arr[p]) {
                sb.append(c);
                arr[p] = true;
            }
        }
        for (int i=0; i<26; i++) {
            if (!arr[i]) sb.append((char) (i + 'A'));
        }
        String key = sb.toString();
        sb.setLength(0);

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            sb.append(key.charAt(s.charAt(i)-'A'));
        }
        System.out.print(sb);
    }
}