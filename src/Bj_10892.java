import java.io.*;
import java.util.*;

public class Bj_10892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n*3; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i+1});
        }
        list.sort(((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        }));
        for (int i = 0; i < n; i++) {
            for (int j=0; j<3; j++) {
                sb.append(list.get(i*3+j)[2]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}