import java.io.*;
import java.util.*;

public class Bj_2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            list.add(Integer.parseInt(st.nextToken()), i);
        }
        for (int i=list.size()-1; i>=0; i--) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.print(sb);
    }
}