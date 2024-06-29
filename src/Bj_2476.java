import java.io.*;
import java.util.*;

public class Bj_2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int result;

            if (a==b && a==c) {
                result = 10000+a*1000;
            } else if (a==b || a==c) {
                result = 1000+a*100;
            } else if (b==c) {
                result = 1000+b*100;
            } else {
                result = Math.max(Math.max(a, b), c)*100;
            }
            max = Math.max(max, result);
        }
        System.out.print(max);
    }
}