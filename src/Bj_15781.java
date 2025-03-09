import java.io.*;
import java.util.*;

public class Bj_15781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            a = Math.max(a, Integer.parseInt(st.nextToken()));
        }
        int b = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            b = Math.max(b, Integer.parseInt(st.nextToken()));
        }
        System.out.print(a+b);
    }
}