import java.io.*;
import java.util.*;

public class Bj_31776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a >= 0 && b == -1 && c == -1) cnt++;
            else if (a >= 0 && b >= a && c == -1) cnt++;
            else if (a >= 0 && b >= a && c >= b) cnt++;
        }
        System.out.print(cnt);
    }
}