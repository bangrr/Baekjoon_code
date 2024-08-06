import java.io.*;
import java.util.*;

public class Bj_9009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[46];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<=45; i++) {
            dp[i] = (dp[i-1] + dp[i-2]);
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=45; i>0; i--) {
                if (n - dp[i] >= 0) {
                    n -= dp[i];
                    list.add(dp[i]);
                }
            }
            for (int i=0; i<list.size(); i++) {
                sb.append(list.get(list.size()-1-i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}