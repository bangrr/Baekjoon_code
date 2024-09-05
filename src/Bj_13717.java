import java.io.*;
import java.util.*;

public class Bj_13717 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int sum = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int c = 0;
            while (k <= m) {
                m -= k;
                c++;
                m += 2;
            }
            sum += c;
            if (max < c) {
                max = c;
                str = s;
            }
        }
        System.out.println(sum);
        System.out.print(str);
    }
}