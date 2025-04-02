import java.io.*;
import java.util.*;

public class Bj_10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            double d = Double.parseDouble(br.readLine());
            sb.append("$").append(String.format("%.2f", d * 0.8)).append("\n");
        }
        System.out.print(sb);
    }
}