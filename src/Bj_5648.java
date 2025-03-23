import java.io.*;
import java.util.*;

public class Bj_5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        ArrayList<Long> arr = new ArrayList<>();

        String s;
        int n = 0;
        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                if (n == 0) {
                    n = Integer.parseInt(st.nextToken());
                } else {
                    arr.add(Long.parseLong(new StringBuilder(st.nextToken()).reverse().toString()));
                }
            }
        }
        Collections.sort(arr);
        for (Long it : arr) {
            sb.append(it).append("\n");
        }
        System.out.print(sb);
    }
}