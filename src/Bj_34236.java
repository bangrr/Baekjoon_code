import java.io.*;
import java.util.*;

public class Bj_34236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int d = a2 - a1;
        for (int i=2; i<n; i++) {
            a2 = Integer.parseInt(st.nextToken());
        }
        System.out.print(a2 + d);
    }
}