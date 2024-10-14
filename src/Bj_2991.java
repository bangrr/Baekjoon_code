import java.io.*;
import java.util.*;

public class Bj_2991 {
    static int a, b, c, d, p, m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        p = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int pc = 0;
        int mc = 0;
        int nc = 0;
        pc += chkMeetDog(a, b, p);
        pc += chkMeetDog(c, d, p);
        mc += chkMeetDog(a, b, m);
        mc += chkMeetDog(c, d, m);
        nc += chkMeetDog(a, b, n);
        nc += chkMeetDog(c, d, n);
        System.out.println(pc);
        System.out.println(mc);
        System.out.println(nc);
    }

    private static int chkMeetDog(int q, int w, int e) {
        return e % (q+w) <= q && e % (q+w) >= 1 ? 1 : 0;
    }
}