import java.io.*;
import java.util.*;

public class Bj_17174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = n;
        while (n / m > 0) {
            sum += n / m;
            n /= m;
        }
        System.out.print(sum);
    }
}