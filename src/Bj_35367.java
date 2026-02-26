import java.io.*;
import java.util.*;

public class Bj_35367 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[] arr = new char[m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) != '.') {
                    arr[j] = s.charAt(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            sb.append(arr[i]);
        }
        System.out.print(sb);
    }
}