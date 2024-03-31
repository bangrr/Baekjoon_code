import java.io.*;
import java.util.*;

public class Bj_3578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int h = Integer.parseInt(br.readLine());
        if (h == 0) {
            sb.append("1");
        } else if (h == 1) {
            sb.append("0");
        } else {
            if (h % 2 == 1) {
                sb.append("4");
            }
            sb.append("8".repeat(h/2));
        }
        System.out.print(sb);
    }
}