import java.io.*;
import java.util.*;

public class Bj_24789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.print(y % 2 == 0 ? "possible" : "impossible");
    }
}