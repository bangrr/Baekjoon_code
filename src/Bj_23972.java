import java.io.*;
import java.util.*;

public class Bj_23972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long k = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        if (n == 1) {
            System.out.print(-1);
        } else {
            System.out.print((k*n) % (n-1) == 0 ? k*n/(n-1) : k*n/(n-1) + 1);
        }
    }
}