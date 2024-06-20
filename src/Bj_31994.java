import java.io.*;
import java.util.*;

public class Bj_31994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = "";
        int m = 0;
        for (int i=0; i<7; i++) {
            st = new StringTokenizer(br.readLine());
            String t = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            if (n > m) {
                s = t;
                m = n;
            }
        }
        System.out.print(s);
    }
}