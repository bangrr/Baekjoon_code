import java.io.*;
import java.util.*;

public class Bj_4998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            double n = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double m = Double.parseDouble(st.nextToken());

            int y = 0;
            while (n <= m) {
                n = n + n * b / 100;
                ++y;
            }
            sb.append(y).append("\n");
        }
        System.out.print(sb);
    }
}