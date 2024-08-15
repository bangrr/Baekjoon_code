import java.io.*;
import java.util.*;

public class Bj_31260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long d = Long.parseLong(br.readLine());
        long t = (100 * x + y) / 2;
        long a = (t + d) / 2;
        long b = (t - d) / 2;
        System.out.println(a/100 + " " + a%100);
        System.out.print(b/100 + " " + b%100);
    }
}