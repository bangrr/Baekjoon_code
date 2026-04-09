import java.io.*;
import java.util.*;

public class Bj_6780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int cnt = 2;
        while (t1 >= t2) {
            int tmp = t1 - t2;
            t1 = t2;
            t2 = tmp;
            cnt++;
        }
        System.out.print(cnt);
    }
}