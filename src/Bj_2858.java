import java.io.*;
import java.util.*;

public class Bj_2858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int s = r+b;

        for (int i=1; i<=s; i++) {
            if (s%i!=0) continue;
            int j = s/i;
            if (b == (i*j - 2*i - 2*j + 4) && r == (2*i + 2*j - 4)) {
                System.out.print(j + " " + i);
                return;
            }
        }
    }
}