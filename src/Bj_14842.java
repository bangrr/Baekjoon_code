import java.io.*;
import java.util.*;

public class Bj_14842 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = (n-1)/2;
        double sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += ((double)(2*i-n%2)/n*h);
        }
        System.out.print(sum * 2);
    }
}