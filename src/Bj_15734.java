import java.io.*;
import java.util.*;

public class Bj_15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int min = Math.min(l, r);
        int max = Math.max(l, r);
        int diff = max - min;
        if (diff >= a) {
            System.out.print((min + a) * 2);
        } else {
            a -= diff;
            min += diff;
            System.out.print((min + a / 2) * 2);
        }
    }
}