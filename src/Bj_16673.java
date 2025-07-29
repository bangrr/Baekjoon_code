import java.io.*;
import java.util.*;

public class Bj_16673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i=1; i<=c; i++) {
            sum += (k*i + p*i*i);
        }
        System.out.print(sum);
    }
}