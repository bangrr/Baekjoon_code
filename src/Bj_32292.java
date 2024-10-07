import java.io.*;
import java.util.*;

public class Bj_32292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            while (s.contains("ABB")) {
                s = s.replace("ABB", "BA");
            }
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}