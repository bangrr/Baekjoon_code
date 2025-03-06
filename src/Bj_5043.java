import java.io.*;
import java.util.*;

public class Bj_5043 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long sum = 0;
        long d = 0;
        while (d <= b) {
            sum += (long) Math.pow(2, d);
            d++;
        }
        System.out.print(n <= sum ? "yes" : "no");
    }
}