import java.io.*;
import java.util.*;

public class Bj_27494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i=2023; i<=n; i++) {
            ans += check(i);
        }
        System.out.print(ans);
    }

    private static int check(int n) {
        String s = String.valueOf(n);
        int[] year = new int[]{2, 0, 2, 3};
        int p = 0;
        for (int i=0; i<s.length(); i++) {
            if (year[p] == s.charAt(i) - '0') {
                p++;
                if (p == 4) {
                    return 1;
                }
            }
        }
        return 0;
    }
}