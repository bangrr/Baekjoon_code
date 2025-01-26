import java.io.*;
import java.util.*;

public class Bj_11896 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long sum = 0;
        for (int i = Math.max(a, 3); i <= Math.max(b, 3); i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.print(sum);
    }
}
