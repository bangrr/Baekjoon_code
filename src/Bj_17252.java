import java.io.*;
import java.util.*;

public class Bj_17252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Long> list = new ArrayList<>();
        long s = 1;
        while (s <= Integer.MAX_VALUE) {
            list.add(s);
            s *= 3;
        }
        list.sort(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        if (n > 0) {
            for (long it : list) {
                if (it <= n) {
                    n -= (int) it;
                }
                if (n == 0) {
                    System.out.print("YES");
                    return;
                }
            }
        }
        System.out.print("NO");
    }
}