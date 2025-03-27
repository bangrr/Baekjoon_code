import java.io.*;
import java.util.*;

public class Bj_33663 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int hlo = Integer.parseInt(st.nextToken());
        int hhi = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int slo = Integer.parseInt(st.nextToken());
        int shi = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int vlo = Integer.parseInt(st.nextToken());
        int vhi = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int M = Math.max(R, Math.max(G, B));
        int m = Math.min(R, Math.min(G, B));

        double H, S, V;
        V = M;
        S = 255 * (V-m)/V;
        if (V == R) {
            H = 60 * (G-B)/(V-m);
        } else if (V == G) {
            H = 120 + 60 * (B-R)/(V-m);
        } else {
            H = 240 + 60 * (R-G)/(V-m);
        }
        if (H < 0) {
            H += 360;
        }

        if (H >= hlo && H <= hhi && S >= slo && S <= shi && V >= vlo && V <= vhi) {
            System.out.print("Lumi will like it.");
        } else {
            System.out.print("Lumi will not like it.");
        }
    }
}