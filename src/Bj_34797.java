import java.io.*;
import java.util.*;

public class Bj_34797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        System.out.print(d % m == 0 ? d / m : d / m + 1);
    }
}