import java.io.*;
import java.util.*;

public class Bj_18412 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        for (int i = 1; i < a; i++) {
            sb.append(s.charAt(i-1));
        }
        for (int i = b; i >= a; i--) {
            sb.append(s.charAt(i-1));
        }
        for (int i = b+1; i <= n; i++) {
            sb.append(s.charAt(i-1));
        }
        System.out.print(sb);
    }
}