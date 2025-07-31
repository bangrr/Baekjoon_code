import java.io.*;
import java.util.*;

public class Bj_4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                char a = st.nextToken().charAt(0);
                char b = st.nextToken().charAt(0);
                if (a == 'R' && b == 'S' || a == 'S' && b == 'P' || a == 'P' && b == 'R' ) {
                    cnt++;
                } else if (a == 'R' && b == 'P' || a == 'P' && b == 'S' || a == 'S' && b == 'R') {
                    cnt--;
                }
            }
            sb.append(cnt > 0 ? "Player 1" : cnt < 0 ? "Player 2" : "TIE").append("\n");
        }
        System.out.print(sb);
    }
}