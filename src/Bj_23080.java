import java.io.*;
import java.util.*;

public class Bj_23080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 0; i < s.length(); i += k) {
            sb.append(s.charAt(i));
        }
        System.out.print(sb);
    }
}
