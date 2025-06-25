import java.io.*;
import java.util.*;

public class Bj_20410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int seed = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());

        for (int a = 0; a < m; a++) {
            for (int c = 0; c < m; c++) {
                if ((x1 == (a * seed + c) % m) && (x2 == (a * x1 + c) % m)) {
                    System.out.print(a + " " + c);
                    return;
                }
            }
        }
    }
}