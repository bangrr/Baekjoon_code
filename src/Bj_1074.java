import java.io.*;
import java.util.*;

public class Bj_1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int s = (int) Math.pow(2, n);
        //n=15 일때 32768 * 32768 = 2^30 == 10^9 , 완전탐색불가

        int a = 0;
        System.out.print(find(s, r, c, a));
    }

    static int find(int s, int r, int c, int a) {
        if (s == 1) return a;

        if (r < s/2 && c < s/2) {
            return find(s/2, r, c, a);
        } else if (r < s/2 && c >= s/2) {
            a += (s * s / 4);
            return find(s/2, r, c - s/2, a);
        } else if (r >= s/2 && c < s/2) {
            a += (s * s / 4) * 2;
            return find(s/2, r - s/2, c, a);
        } else { // if (r >= s/2 && c >= s/2)
            a += (s * s / 4) * 3;
            return find(s/2, r - s/2, c - s/2, a);
        }
    }
}