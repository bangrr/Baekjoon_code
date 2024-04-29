import java.io.*;
import java.util.*;

public class Bj_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        double x = d / Math.sqrt(h*h + w*w);
        System.out.println((int)(x * h) + " " + (int)(x * w));
    }
}