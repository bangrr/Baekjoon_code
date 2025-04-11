import java.io.*;
import java.util.*;

public class Bj_2896 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double i = Double.parseDouble(st.nextToken());
        double j = Double.parseDouble(st.nextToken());
        double k = Double.parseDouble(st.nextToken());

        double min = Math.min(a/i, Math.min(b/j, c/k));

        System.out.print((a-i*min) + " " + (b-j*min) + " " + (c-k*min));
    }
}