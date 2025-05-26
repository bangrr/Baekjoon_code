import java.io.*;
import java.util.*;

public class Bj_33909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int o = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int sn = s + n;
        int co = c + o * 2;
        System.out.print(Math.min(sn / 3, co / 6));
    }
}