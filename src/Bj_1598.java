import java.io.*;
import java.util.*;

public class Bj_1598 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int w = Math.abs((n-1)/4 - (m-1)/4);
        int h = Math.abs((n-1)%4 - (m-1)%4);
        System.out.print(w + h);
    }
}