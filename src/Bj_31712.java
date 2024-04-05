import java.io.*;
import java.util.*;

public class Bj_31712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int cu = Integer.parseInt(st.nextToken());
        int du = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cd = Integer.parseInt(st.nextToken());
        int dd = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cp = Integer.parseInt(st.nextToken());
        int dp = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(br.readLine());
        int ch = -1;
        while (h > 0) {
            ch++;
            if (ch % cu == 0) {
                h-=du;
            }
            if (ch % cd == 0) {
                h-=dd;
            }
            if (ch % cp == 0) {
                h-=dp;
            }
        }
        System.out.print(ch);
    }
}