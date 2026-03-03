import java.io.*;
import java.util.*;

public class Bj_29319 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            max = Math.max(max, a);
            sum += a;
        }
        System.out.print(sum - max);
    }
}