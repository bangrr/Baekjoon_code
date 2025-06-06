import java.io.*;
import java.util.*;

public class Bj_12756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int aa = Integer.parseInt(st.nextToken());
        int ah = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ba = Integer.parseInt(st.nextToken());
        int bh = Integer.parseInt(st.nextToken());

        int at = ah/ba;
        int bt = bh/aa;
        int am = ah%ba;
        int bm = bh%aa;

        if (at > bt) {
            System.out.print("PLAYER A");
        } else if (at < bt) {
            System.out.print("PLAYER B");
        } else {
            // at == bt
            if (am > 0 && bm == 0) {
                System.out.print("PLAYER A");
            } else if (am == 0 && bm > 0) {
                System.out.print("PLAYER B");
            } else {
                System.out.print("DRAW");
            }
        }
    }
}