import java.io.*;
import java.util.*;

public class Bj_18766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int[][] arr = new int[3][10];
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                String s = st.nextToken();
                char c = s.charAt(0);
                if (c == 'R') {
                    arr[0][s.charAt(1) - '0']++;
                } else if (c == 'Y') {
                    arr[1][s.charAt(1) - '0']++;
                } else {
                    arr[2][s.charAt(1) - '0']++;
                }
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                String s = st.nextToken();
                char c = s.charAt(0);
                if (c == 'R') {
                    arr[0][s.charAt(1) - '0']--;
                } else if (c == 'Y') {
                    arr[1][s.charAt(1) - '0']--;
                } else {
                    arr[2][s.charAt(1) - '0']--;
                }
            }

            boolean flag = false;
            for (int i = 0; i < 10; i++) {
                if (arr[0][i] != 0 || arr[1][i] != 0 || arr[2][i] != 0) {
                    flag = true;
                    break;
                }
            }
            sb.append(flag ? "CHEATER" : "NOT CHEATER").append("\n");
        }
        System.out.print(sb);
    }
}