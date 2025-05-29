import java.io.*;

public class Bj_9494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int idx = -1;
            for (int i = 0; i < n; i++) {
                String s = br.readLine() + " ";
                for (int j = 0; j < s.length(); j++) {
                    if (idx <= j && s.charAt(j) == ' ') {
                        idx = j;
                        break;
                    }
                }
            }
            sb.append(idx + 1).append("\n");
        }
        System.out.print(sb);
    }
}