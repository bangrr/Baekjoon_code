import java.io.*;
import java.util.*;

public class Bj_26529 {
    static long[] f;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        f = new long[46];
        fiboTo45();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            sb.append(f[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.print(sb);
    }

    private static void fiboTo45() {
        f[0] = f[1] = 1;
        for (int i=2; i<=45; i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }
}
