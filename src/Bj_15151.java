import java.io.*;
import java.util.*;

public class Bj_15151 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int cnt = 0;
        while (d >= k) {
            d -= k;
            cnt++;
            k *= 2;
        }
        System.out.print(cnt);
    }
}