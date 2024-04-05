import java.io.*;
import java.util.*;

public class Bj_21146 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.print((double)(sum + (-3 * (n-k)))/n + " ");
        System.out.print((double)(sum + (3 * (n-k)))/n);
    }
}