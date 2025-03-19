import java.io.*;
import java.util.*;

public class Bj_33574 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1) {
                    list.sort(Comparator.naturalOrder());
                } else if (x == 2) {
                    list.sort(Comparator.reverseOrder());
                } else {
                    throw new IllegalArgumentException("Invalid x value: " + x);
                }
            } else if (command == 2) {
                int x = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                list.add(x, t);
            } else {
                throw new IllegalArgumentException("Invalid command: " + command);
            }
        }
        sb.append(list.size()).append("\n");
        for (int it : list) {
            sb.append(it).append(" ");
        }
        System.out.print(sb);
    }
}