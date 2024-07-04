import java.io.*;
import java.util.*;

public class Bj_29757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new int[]{x, y, i});
        }
        list.sort((o1, o2) ->
                o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        for (int i = 1; i < list.size(); i++) {
            sb.append(list.get(i-1)[2]).append(" ").append(list.get(i)[2]).append("\n");
        }
        System.out.print(sb);
    }
}