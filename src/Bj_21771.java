import java.io.*;
import java.util.*;

public class Bj_21771 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int rg = Integer.parseInt(st.nextToken());
        int cg = Integer.parseInt(st.nextToken());
        int rp = Integer.parseInt(st.nextToken());
        int cp = Integer.parseInt(st.nextToken());
        int mg = rg * cg;
        int mp = rp * cp;
        int cntG = 0;
        int cntP = 0;
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                if (s.charAt(j) == 'G') {
                    cntG++;
                } else if (s.charAt(j) == 'P') {
                    cntP++;
                }
            }
        }
        System.out.print(cntG == mg && cntP < mp ? 1 : 0);
    }
}