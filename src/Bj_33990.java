import java.io.*;
import java.util.*;

public class Bj_33990 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int min = 601;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = a+b+c;
            if (d >= 512) {
                min = Math.min(d, min);
            }
        }
        System.out.print(min == 601 ? -1 : min);
    }
}