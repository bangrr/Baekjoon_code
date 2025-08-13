import java.io.*;
import java.util.*;

public class Bj_34028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int a = (y - 2015 + (m == 12 ? 1 : 0)) * 4;
        if (m >= 3 && m <= 5) {
            a += 2;
        } else if (m >= 6 && m <= 8) {
            a += 3;
        } else if (m >= 9 && m <= 11) {
            a += 4;
        } else {
            a += 1;
        }
        System.out.print(a);
    }
}