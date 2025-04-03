import java.io.*;
import java.util.*;

public class Bj_33753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        int ans;
        if (t <= 30) {
            ans = a;
        } else {
            ans = a + ((t - 30) % b == 0 ? (t - 30) / b * c : (int) (Math.ceil((double) (t - 30) / b) * c));
        }
        System.out.println(ans);
    }
}