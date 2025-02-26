import java.io.*;
import java.util.*;

public class Bj_11816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String x = br.readLine();
        if (x.charAt(0) == '0') {
            if (x.charAt(1) == 'x') {
                sb.append(Integer.parseInt(x.substring(2), 16));
            } else {
                sb.append(Integer.parseInt(x.substring(1), 8));
            }
        } else {
            sb.append(x);
        }
        System.out.print(sb);
    }
}