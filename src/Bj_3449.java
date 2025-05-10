import java.io.*;

public class Bj_3449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String a = br.readLine();
            String b = br.readLine();
            int cnt = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    cnt++;
                }
            }
            sb.append("Hamming distance is ").append(cnt).append(".\n");
        }
        System.out.print(sb);
    }
}