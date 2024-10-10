import java.io.*;
import java.util.*;

public class Bj_24936 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Set<Integer> treeSet = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            treeSet.add(sum - arr[i]);
        }
        sb.append(treeSet.size()).append("\n");
        for (int it : treeSet) {
            sb.append(it).append(" ");
        }
        System.out.print(sb);
    }
}