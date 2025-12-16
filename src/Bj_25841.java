import java.io.*;
import java.util.*;

public class Bj_25841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch - '0' == c) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}