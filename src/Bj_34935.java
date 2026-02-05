import java.io.*;
import java.util.*;

public class Bj_34935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean chk = true;
        st = new StringTokenizer(br.readLine());
        long s = Long.parseLong(st.nextToken());
        for (int i=1; i<n; i++) {
            long t = Long.parseLong(st.nextToken());
            if (s >= t) {
                chk = false;
            }
            s = t;
        }
        if (chk) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}