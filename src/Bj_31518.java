import java.util.*;
import java.io.*;

public class Bj_31518 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                int m = Integer.parseInt(st.nextToken());
                if (m == 7) ans++;
            }
        }
        if (ans == 3) System.out.print(777);
        else System.out.print(0);
    }
}