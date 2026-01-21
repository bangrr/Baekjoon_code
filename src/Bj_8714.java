import java.io.*;
import java.util.*;

public class Bj_8714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int z = 0;
        int o = 0;
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) {
                z++;
            } else {
                o++;
            }
        }
        System.out.print(Math.min(z, o));
    }
}