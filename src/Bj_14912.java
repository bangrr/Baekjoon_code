import java.io.*;
import java.util.*;

public class Bj_14912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);
        int cnt = 0;
        for (int i=1; i<=n; i++) {
            String s = String.valueOf(i);
            for (int p=0; p<s.length(); p++) {
                char c = s.charAt(p);
                if (c == d) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}