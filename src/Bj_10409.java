import java.io.*;
import java.util.*;

public class Bj_10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int sum = 0;
        int ans = n;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(st.nextToken());
            sum += time;
            if (sum > T) {
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}