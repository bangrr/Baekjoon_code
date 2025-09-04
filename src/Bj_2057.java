import java.io.*;
import java.util.*;

public class Bj_2057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        int f = 1;
        while (list.get(f - 1) * f <= 1000000000000000000L) {
            list.add(list.get(f-1) * f);
            f++;
        }

        long n = Long.parseLong(br.readLine());
        if (n == 0) {
            System.out.print("NO");
            return;
        }

        for (int i = list.size()-1; i >= 0; i--) {
            if (n >= list.get(i)) {
                n -= list.get(i);
            }
        }
        System.out.print(n == 0 ? "YES" : "NO");
    }
}