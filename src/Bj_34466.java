import java.io.*;
import java.util.*;

public class Bj_34466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p = (Math.max(a, x) + b + y) * 2;
        int q = (Math.max(b, y) + a + x) * 2;
        System.out.print(Math.min(p, q));
    }
}