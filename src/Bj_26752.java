import java.io.*;
import java.util.*;

public class Bj_26752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int time = h*3600 + m*60 + s + 1;
        if (time >= 3600 * 24) {
            time -= 3600 * 24;
        }
        h = time / 3600;
        m = (time % 3600) / 60;
        s = time % 60;
        sb.append(String.format("%02d", h)).append(":").append(String.format("%02d", m)).append(":").append(String.format("%02d", s));
        System.out.print(sb);
    }
}