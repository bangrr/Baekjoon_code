import java.io.*;
import java.util.*;

public class Bj_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int ans = 0;
        int[] s = new int[11];
        for (int i = 1; i <= 10; i++) {
            s[i] = s[i-1] + Integer.parseInt(br.readLine());
            if (s[i] >= 100) {
                ans = s[i]-100 <= 100-s[i-1] ? s[i] : s[i-1];
                break;
            }
        }
        if (ans == 0) ans = s[10];
        System.out.print(ans);
    }
}