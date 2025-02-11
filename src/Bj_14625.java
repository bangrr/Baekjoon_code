import java.io.*;
import java.util.*;

public class Bj_14625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int th = Integer.parseInt(st.nextToken());
        int tm = Integer.parseInt(st.nextToken());
        String n = br.readLine();

        int cnt = 0;
        for (int i = h; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if ((i == h && j >= m) || i > h) {
                    String si = i < 10 ? "0" + i : String.valueOf(i);
                    String sj = j < 10 ? "0" + j : String.valueOf(j);
                    if (si.contains(n) || sj.contains(n)) cnt++;
                    if (i == th && j == tm) {
                        System.out.print(cnt);
                        return;
                    }
                }
            }
        }
    }
}
