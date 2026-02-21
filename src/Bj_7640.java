import java.io.*;
import java.util.*;

public class Bj_7640 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int h = Integer.parseInt(br.readLine());
                map.put(h, map.getOrDefault(h, 0) + 1);
            }
            sb.append(Collections.max(map.values())).append("\n");
        }
        System.out.print(sb);
    }
}