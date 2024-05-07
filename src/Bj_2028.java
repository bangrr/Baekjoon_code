import java.io.*;
import java.util.*;

public class Bj_2028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int len = String.valueOf(n).length();
            sb.append(n*n%(Math.pow(10,len))==n?"YES\n":"NO\n");
        }
        System.out.print(sb);
    }
}