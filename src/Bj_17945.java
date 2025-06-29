import java.io.*;
import java.util.*;

public class Bj_17945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = -1000; i <= 1000; i++) {
            if (i * i + 2 * a * i + b == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}