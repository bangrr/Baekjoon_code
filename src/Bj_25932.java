import java.io.*;
import java.util.*;

public class Bj_25932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            boolean mack = false, zack = false;
            for (int j=0; j<10; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 18) {
                    mack = true;
                } else if (x == 17) {
                    zack = true;
                }
                sb.append(x).append(" ");
            }
            sb.append("\n");
            if (mack && zack) {
                sb.append("both");
            } else if (mack) {
                sb.append("mack");
            } else if (zack) {
                sb.append("zack");
            } else {
                sb.append("none");
            }
            sb.append("\n").append("\n");
        }
        System.out.print(sb);
    }
}