import java.io.*;
import java.util.*;

public class Bj_32141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int ans = -1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(st.nextToken());
            h -= d;
            if (h <= 0) {
                ans = i+1;
                break;
            }
        }
        System.out.print(ans);
    }
}