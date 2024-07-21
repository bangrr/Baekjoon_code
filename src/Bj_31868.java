import java.io.*;
import java.util.*;

public class Bj_31868 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i=1; i<n; i++) {
            k = k / 2;
        }
        System.out.print(k);
    }
}