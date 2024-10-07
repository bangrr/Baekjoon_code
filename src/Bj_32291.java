import java.io.*;
import java.util.*;

public class Bj_32291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long x = Long.parseLong(br.readLine());
        Set<Long> set = new TreeSet<>();
        for (long i = 1; i*i <= (x+1); i++) {
            if (x / i != (x+1) / i) {
                set.add(i);
                if (i > 1) set.add((x+1)/i);
            }
        }
        for (long it : set) {
            sb.append(it).append(" ");
        }
        System.out.print(sb);
    }
}