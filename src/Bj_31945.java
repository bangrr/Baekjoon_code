import java.io.*;
import java.util.*;

public class Bj_31945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[]{
                "0123", "4567", "0145", "2367" ,"1357", "0246"
        };
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int[] tmp = new int[4];
            for (int i = 0; i < 4; i++) {
                tmp[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(tmp);
            String s = "";
            for (int item : tmp) s += String.valueOf(item);

            String ans = "NO";
            for (String str : arr) {
                if (str.equals(s.toString())) ans = "YES";
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}