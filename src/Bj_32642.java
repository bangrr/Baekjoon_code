import java.io.*;
import java.util.*;

public class Bj_32642 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int b = 0;
        long sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(st.nextToken());
            b += (t == 1 ? 1 : -1);
            sum += b;
        }
        System.out.print(sum);
    }
}