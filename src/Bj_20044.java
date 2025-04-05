import java.io.*;
import java.util.*;

public class Bj_20044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n * 2; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int minSum = 20250405;
        for (int i = 0; i < n; i++) {
            minSum = Math.min(minSum, list.get(i) + list.get(list.size() - 1 - i));
        }
        System.out.print(minSum);
    }
}