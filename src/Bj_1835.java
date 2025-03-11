import java.io.*;
import java.util.*;

public class Bj_1835 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = n; i >= 1; i--) {
            dq.offerFirst(i);
            for (int j = 0; j < i; j++) {
                dq.offerFirst(dq.removeLast());
            }
        }
        for (int it : dq) {
            sb.append(it).append(" ");
        }
        System.out.print(sb);
    }
}