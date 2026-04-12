import java.io.*;
import java.util.*;

public class Bj_5013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            if (!s.contains("CD")) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}