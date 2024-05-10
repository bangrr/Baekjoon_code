import java.io.*;
import java.util.*;

public class Bj_31669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] cnt = new int[m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'O') cnt[j]++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (cnt[i] == 0) {
                System.out.print(i+1);
                return;
            }
        }
        System.out.print("ESCAPE FAILED");
    }
}