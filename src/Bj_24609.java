import java.io.*;
import java.util.*;

public class Bj_24609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int s = 0;
        int m = 0;
        for  (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            s += t;
            if (s < 0) {
                m = Math.min(m, s);
            }
        }
        System.out.print(-m);
    }
}