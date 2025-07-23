import java.io.*;

public class Bj_2145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int res = 0;
            while (n > 9) {
                String str = String.valueOf(n);
                for (int i = 0; i < str.length(); i++) {
                    res += Integer.parseInt(str.substring(i, i+1));
                }
                n = res;
                res = 0;
            }
            sb.append(n).append("\n");
        }
        System.out.print(sb);
    }
}