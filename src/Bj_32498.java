import java.io.*;
import java.util.*;

public class Bj_32498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i=0; i<n; i++) {
            int d = Integer.parseInt(br.readLine());
            if (d % 2 == 1) cnt++;
        }
        System.out.print(cnt);
    }
}