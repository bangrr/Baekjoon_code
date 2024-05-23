import java.util.*;
import java.io.*;

public class Bj_1684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int[] sub = new int[n-1];
        for (int i=1; i<n; i++) {
            sub[i-1] = arr[i]-arr[i-1];
        }

        int gcd = sub[0];
        for (int i=1; i<sub.length; i++) {
            gcd = getGcd(gcd, sub[i]);
        }
        System.out.print(gcd);
    }

    private static int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }
}