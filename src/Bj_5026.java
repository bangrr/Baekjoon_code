import java.io.*;
import java.util.*;

public class Bj_5026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            if (Objects.equals(s, "P=NP")) {
                sb.append("skipped\n");
            } else {
                int i = s.indexOf("+");
                int a = Integer.parseInt(s.substring(0, i));
                int b = Integer.parseInt(s.substring(i+1));
                sb.append(a + b).append("\n");
            }
        }
        System.out.print(sb);
    }
}