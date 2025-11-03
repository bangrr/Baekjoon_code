import java.io.*;
import java.util.*;

public class Bj_25828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int a = g * p;
        int b = g + p * t;
        System.out.print(a < b ? 1 : a > b ? 2 : 0);
    }
}