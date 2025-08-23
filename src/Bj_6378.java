import java.io.*;

public class Bj_6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if ("0".equals(s)) break;

            while (s.length() > 1) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += (s.charAt(i) - '0');
                }
                s = String.valueOf(sum);
            }
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}