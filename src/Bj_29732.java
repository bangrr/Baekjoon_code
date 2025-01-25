import java.io.*;
import java.util.*;

public class Bj_29732 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        boolean[] check = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                for (int j = Math.max(0, i - k); j <= Math.min(n - 1, i + k); j++) {
                    check[j] = true;
                }
            }
        }
        int cnt = 0;
        for (boolean rr : check) {
            if (rr) cnt++;
        }
        System.out.print(cnt <= m ? "Yes" : "No");
    }
}
