import java.io.*;
import java.util.*;

public class Bj_32795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String a = br.readLine();
            String b = br.readLine();
            String ans = "YES";
            for (int i = 0; i < b.length(); i++) {
                char c = b.charAt(i);
                if (!a.contains(String.valueOf(c))) {
                    ans = "NO";
                    break;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
