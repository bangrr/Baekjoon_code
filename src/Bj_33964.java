import java.io.*;
import java.util.*;

public class Bj_33964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt("1".repeat(Integer.parseInt(st.nextToken())));
        int y = Integer.parseInt("1".repeat(Integer.parseInt(st.nextToken())));
        System.out.print(x + y);
    }
}