import java.util.*;
import java.io.*;

public class Bj_29716 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int j = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int ans = 0;
        while (n-- > 0) {
            String s = br.readLine();
            int sum = 0;
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c == 32) sum += 1;
                else if (c < 65 || c >= 97) sum += 2;
                else sum += 4;
            }
            if (sum <= j) ans++;
        }
        System.out.print(ans);
    }
}