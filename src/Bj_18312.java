import java.io.*;
import java.util.*;

public class Bj_18312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int m = 0; m < 60; m++) {
                    String s = String.format("%02d%02d%02d", i, j, m);
                    if (s.contains(String.valueOf(k))) cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}