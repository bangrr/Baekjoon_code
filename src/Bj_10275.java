import java.io.*;
import java.util.*;

public class Bj_10275 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String a = Long.toBinaryString(Long.parseLong(st.nextToken()));
            String b = Long.toBinaryString(Long.parseLong(st.nextToken()));
            int[] arr = new int[n+1];
            for (int i=0; i<a.length(); i++) {
                arr[n-1-i] += a.charAt(a.length()-1-i)-'0';
            }
            for (int i=0; i<b.length(); i++) {
                arr[n-1-i] += b.charAt(b.length()-1-i)-'0';
            }
            int cnt = 1;
            for (int it : arr) {
                if (it == 1) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}