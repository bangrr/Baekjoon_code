import java.io.*;
import java.util.*;

public class Bj_2090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        long mul = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            mul *= arr[i];
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mul / arr[i];
        }
        long g = gcd(sum, mul);
        System.out.print(mul / g + "/" + sum / g);
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}