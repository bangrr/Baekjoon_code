import java.io.*;
import java.util.*;

public class Bj_34217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int h = a + c;
        int y = b + d;
        System.out.print(h < y ? "Hanyang Univ." : h > y ? "Yongdap" : "Either");
    }
}