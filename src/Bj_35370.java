import java.io.*;
import java.util.*;

public class Bj_35370 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        System.out.print(k > s ? s : k % s == 0 ? s/k : s/k + s%k);
    }
}