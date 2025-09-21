import java.io.*;
import java.util.*;

public class Bj_34400 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int t = Integer.parseInt(br.readLine());
            sb.append(t % 25 < 17 ? "ONLINE" : "OFFLINE").append("\n");
        }
        System.out.print(sb);
    }
}