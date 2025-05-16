import java.io.*;

public class Bj_33845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[26];
        String a = br.readLine();
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a'] = true;
        }
        String b = br.readLine();
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (arr[c - 'a']) continue;
            sb.append(c);
        }
        System.out.print(sb);
    }
}