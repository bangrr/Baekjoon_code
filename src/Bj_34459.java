import java.io.*;
import java.util.*;

public class Bj_34459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long a = 5;
        ArrayList<Long> list = new ArrayList<>();
        while (a <= 5000000000L) {
            list.add(a);
            a *= 5;
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n <= 5) {
                sb.append("MIT time").append("\n");
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (n <= list.get(i)) {
                        sb.append("MIT^").append(i + 1).append(" time\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);
    }
}