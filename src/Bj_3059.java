import java.io.*;

public class Bj_3059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            boolean[] chk = new boolean[26];
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'A';
                if (!chk[idx]) {
                    chk[idx] = true;
                }
            }
            int sum = 0;
            for (int i = 0; i < chk.length; i++) {
                if (!chk[i]) {
                    sum += (i + 65);
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}