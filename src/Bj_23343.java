import java.io.*;
import java.util.*;

public class Bj_23343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String x = st.nextToken();
        String y = st.nextToken();
        try {
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            System.out.print(a-b);
        } catch (Exception e) {
            System.out.print("NaN");
        }
    }
}