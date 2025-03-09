import java.io.*;
import java.util.*;

public class Bj_17072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                int r = Integer.parseInt(st.nextToken());
                int g = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int intensity = 2126*r + 7152*g + 722*b;
                if (intensity < 510000) {
                    sb.append("#");
                } else if (intensity < 1020000) {
                    sb.append("o");
                } else if (intensity < 1530000) {
                    sb.append("+");
                } else if (intensity < 2040000) {
                    sb.append("-");
                } else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}