import java.io.*;
import java.util.*;

public class Bj_31798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a == 0) {
            System.out.print(c*c-b);
        } else if (b == 0) {
            System.out.print(c*c-a);
        } else {
            System.out.print((int)Math.sqrt(a+b));
        }
    }
}