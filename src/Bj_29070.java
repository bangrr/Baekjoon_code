import java.io.*;
import java.util.*;

public class Bj_29070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int ha = h%a == 0 ? h/a : h/a+1;
        int wb = w%b == 0 ? w/b : w/b+1;
        System.out.print(ha*wb);
    }
}