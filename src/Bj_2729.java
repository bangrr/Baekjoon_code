import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_2729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken(), 2);
            BigInteger b = new BigInteger(st.nextToken(), 2);

            sb.append(a.add(b).toString(2)).append("\n");
        }
        System.out.print(sb);
    }
}
