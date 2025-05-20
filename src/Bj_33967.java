import java.io.*;

public class Bj_33967 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String p = "[25]";
        int[][] arr = new int[][]{
                {1, 1, 1, 1},
                {1, 2, 1, 1},
                {1, 1, 2, 1},
                {0, 1, 1, 1}
        };

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) break;
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            ans += arr[p.indexOf(c)][p.indexOf(d)];
        }
        System.out.print(ans);
    }
}