import java.io.*;
import java.util.*;

public class Bj_23253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i=0; i<m; i++) {
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int min = 222222;
            for (int j=0; j<k; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (min > a) {
                    min = a;
                } else {
                    System.out.print("No");
                    return;
                }
            }
        }
        System.out.print("Yes");
    }
}