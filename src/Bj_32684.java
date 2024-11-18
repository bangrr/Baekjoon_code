import java.io.*;
import java.util.*;

public class Bj_32684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] score = new int[]{13, 7, 5, 3, 3, 2};
        double ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            ans += (Integer.parseInt(st.nextToken()) * score[i]);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            ans -= (Integer.parseInt(st.nextToken()) * score[i]);
        }
        ans -= 1.5;

        System.out.print(ans > 0 ? "cocjr0208" : "ekwoo");
    }
}