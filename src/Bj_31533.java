import java.io.*;
import java.util.*;

public class Bj_31533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        if ((double)Math.min(m, n) / a * 2 < Math.max(m, n)) {
            System.out.print((double)Math.min(m, n) / a * 2);
        } else {
            System.out.print(Math.max(m, n));
        }
    }
}