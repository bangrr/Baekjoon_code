import java.io.*;
import java.util.*;

public class Bj_33147 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int g = gcd(n, k);

        if (g != 1 && n % g == 0) {
            for (int i = 0; i < g; i++) {
                for (int j = i; j < n; j += g) {
                    if (arr[j] % g != i) {
                        System.out.print("NO");
                        return;
                    }
                }
            }
        }
        System.out.print("YES");
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
