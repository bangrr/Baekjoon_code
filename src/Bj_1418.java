import java.io.*;
import java.util.*;

public class Bj_1418 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int cnt = n;

        for (int i=1; i<=n; i++) {
            int num = i;
            int d = 2;
            while (num > 1) {
                if (num % d == 0 && d <= k) {
                    num /= d;
                } else if (d > k) {
                    cnt--;
                    break;
                } else {
                    d++;
                }
            }
        }
        System.out.print(cnt);
    }
}
