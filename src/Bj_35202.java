import java.io.*;
import java.util.*;

public class Bj_35202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n > m) {
            System.out.print(0);
        } else if (n < m) {
            System.out.print(n+1);
        } else {
            System.out.print(m);
        }
    }
}