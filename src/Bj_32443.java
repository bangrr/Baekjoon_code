import java.io.*;
import java.util.*;

public class Bj_32443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[31];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(Integer.parseInt(st.nextToken()));
            for (int j = s.length()-1; j >=0; j--) {
                arr[30-j] += s.charAt(s.length()-1-j)-48;
            }
        }
        for (int i = 0; i < n; i++) {
            int ans = 0;
            for (int j = 0; j < 31; j++) {
                ans *= 2;
                if (arr[j] > 0) {
                    ans += 1;
                    arr[j]--;
                }
            }
            sb.append(ans).append(" ");
        }
        System.out.print(sb);
    }
}