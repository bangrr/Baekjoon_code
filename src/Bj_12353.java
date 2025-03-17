import java.io.*;
import java.util.*;

public class Bj_12353 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            String gen = st.nextToken();
            String mom = st.nextToken();
            String dad = st.nextToken();
            int mop = Integer.parseInt(mom.substring(0, 1));
            int moi = Integer.parseInt(mom.substring(2, mom.length() - 1));
            int dap = Integer.parseInt(dad.substring(0, 1));
            int dai = Integer.parseInt(dad.substring(2, dad.length() - 1));

            int chp = mop + dap;
            double chi = moi + dai + (gen.equals("B") ? 5 : -5);

            if (chi < 0) {
                chi = 12 + chi;
                chp--;
            } else if (chi >= 24) {
                chi = chi - 24;
                chp += 2;
            } else if (chi >= 12) {
                chi = chi - 12;
                chp += 1;
            }

            if (chp % 2 == 1) {
                chi += 12;
                chp--;
            }
            chp = chp / 2;
            boolean point = chi % 2 == 1;
            chi = chi / 2;
            double d = point ? 3.5 : 4;

            int lp = chp;
            if (chi - d < 0) {
                lp--;
            }
            double li = chi - d < 0 ? 12 + chi - d : chi - d;

            int rp = chp;
            if (chi + d >= 12) {
                rp++;
            }
            double ri = chi + d >= 12 ? chi + d - 12 : chi + d;

            sb.append("Case #").append(i).append(": ").append(lp).append("'").append((int) li).append("\" to ").append(rp).append("'").append((int) ri).append("\"").append("\n");
        }
        System.out.print(sb);
    }
}