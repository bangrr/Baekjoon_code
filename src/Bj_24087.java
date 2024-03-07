import java.util.*;
import java.io.*;

public class Bj_24087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int ans = 250;
        while (s > a) {
            ans += 100;
            a += b;
        }
        System.out.print(ans);
    }
}