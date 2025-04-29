import java.io.*;
import java.util.*;

public class Bj_26338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int q=1; q<=t; q++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int c = Integer.parseInt(st.nextToken());
                list.add(c);
            }
            Collections.sort(list);

            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (max + 1 < list.get(i)) {
                    break;
                }
                max += list.get(i);
            }
            sb.append("Set #").append(q).append(": ").append(max + 1).append("\n\n");
        }
        System.out.print(sb);
    }
}