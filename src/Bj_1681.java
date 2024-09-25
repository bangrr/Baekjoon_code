import java.io.*;
import java.util.*;

public class Bj_1681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String l = st.nextToken();
        int a = 0;
        int c = 0;
        while (a < n) {
            if (String.valueOf(++c).contains(l)) continue;
            a++;
        }
        System.out.print(c);
    }
}