import java.io.*;
import java.util.*;

public class Bj_31831 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = 0;
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            c += Integer.parseInt(st.nextToken());
            if (c < 0) c = 0;
            if (c >= m) cnt++;
        }
        sb.append("asdasdas");
        System.out.println(sb);
        System.out.print(cnt);
    }
}