import java.io.*;
import java.util.*;

public class Bj_24387 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] a = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int[] b = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b);
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += (long)a[i] * b[i];
        }
        System.out.print(sum);
    }
}