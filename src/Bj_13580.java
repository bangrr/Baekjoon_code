import java.io.*;
import java.util.*;

public class Bj_13580 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a == b || b == c || c == a) {
            System.out.print("S");
        } else if (a == b + c || b == a + c || c == a + b) {
            System.out.print("S");
        } else {
            System.out.print("N");
        }
    }
}