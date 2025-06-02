import java.io.*;
import java.util.*;

public class Bj_4632 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0) {
                break;
            }

            int maxWidth = 0;
            int maxHeight = 0;
            int tmpWidth = 0;
            int tmpHeight = 0;

            while (true) {
                st = new StringTokenizer(br.readLine());
                int w = Integer.parseInt(st.nextToken());
                int h = Integer.parseInt(st.nextToken());
                if (w == -1 && h == -1) {
                    break;
                }

                if (tmpWidth + w > m) {
                    maxWidth = Math.max(tmpWidth, maxWidth);
                    tmpWidth = 0;
                    maxHeight += tmpHeight;
                    tmpHeight = 0;
                }
                tmpWidth += w;
                tmpHeight = Math.max(tmpHeight, h);
            }
            maxWidth = Math.max(tmpWidth, maxWidth);
            maxHeight += tmpHeight;

            sb.append(maxWidth).append(" x ").append(maxHeight).append("\n");
        }
        System.out.print(sb);
    }
}