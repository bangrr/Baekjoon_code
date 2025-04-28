import java.io.*;
import java.util.*;

public class Bj_14579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long ans = 1;
        for (int i = a; i <= b; i++) {
            ans = (ans * i*(i+1)/2) % 14579;
        }
        System.out.print(ans);
    }
}