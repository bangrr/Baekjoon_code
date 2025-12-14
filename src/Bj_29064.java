import java.io.*;
import java.util.*;

public class Bj_29064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 1) {
                cnt++;
            }
        }
        System.out.print(Math.max(0, (n+1)/2 - cnt));
    }
}