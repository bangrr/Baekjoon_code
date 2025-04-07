import java.io.*;
import java.util.*;

public class Bj_14648 {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if (cmd == 1) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(sumAndSwap(a, b)).append("\n");
            } else {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                sb.append(sumAndSubtract(a, b, c, d)).append("\n");
            }
        }
        System.out.print(sb);
    }

    static long sumAndSwap(int a, int b) {
        long sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return sum;
    }

    static long sumAndSubtract(int a, int b, int c, int d) {
        long sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        for (int i = c; i <= d; i++) {
            sum -= arr[i];
        }
        return sum;
    }
}