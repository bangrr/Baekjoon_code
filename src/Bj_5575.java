import java.io.*;
import java.util.*;

public class Bj_5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());
            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());
            int es = Integer.parseInt(st.nextToken());
            System.out.println(calculate(sh, sm, ss, eh, em, es));
        }
    }

    private static String calculate(int sh, int sm, int ss, int eh, int em, int es) {
        int res = (eh - sh) * 3600 + (em - sm) * 60 + (es - ss);
        int h = res / 3600;
        int m = res % 3600 / 60;
        int s = res % 60;
        return h + " " + m + " " + s;
    }
}