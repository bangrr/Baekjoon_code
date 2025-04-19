import java.io.*;
import java.util.*;

public class Bj_4562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long k = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            System.out.println(k<n?"NO BRAINS":"MMM BRAINS");
        }
    }
}