import java.io.*;
import java.util.*;

public class Bj_6973 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            Map<String, Integer> map = new HashMap<>();
            int dict = 1;
            String s;
            while ((s = br.readLine()) != null) {
                if (s.isEmpty()) {
                    break;
                }
                String[] arr = s.split(" ");
                for (String it : arr) {
                    if (!map.containsKey(it)) {
                        map.put(it, dict++);
                        sb.append(it).append(" ");
                    } else {
                        sb.append(map.get(it)).append(" ");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
            t--;
        }
        System.out.print(sb);
    }
}