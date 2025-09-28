import java.io.*;
import java.util.*;

public class Bj_34529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int sum = 0;
        sum += u / 100 * x;
        sum += v / 50 * y;
        sum += w / 20 * z;
        System.out.print(sum);
    }
}