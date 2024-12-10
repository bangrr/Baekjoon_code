import java.util.*;
import java.io.*;

public class Bj_32779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            sb.append(a*m*1056/10000/60).append("\n");
        }
        System.out.print(sb);
    }
}
