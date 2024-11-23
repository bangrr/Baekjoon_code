import java.io.*;
import java.util.*;

public class Bj_2863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());

        double max = 0;
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (max < a / c + b / d) {
                max = a / c + b / d;
                ans = i;
            }
            double t = a;
            a = c; c = d; d = b; b = t;
        }
        System.out.print(ans);
    }
}