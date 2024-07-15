import java.io.*;
import java.util.*;

public class Bj_29723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int p = Integer.parseInt(st.nextToken());
            map.put(s, p);
        }
        int sum = 0;
        for (int i=0; i<k; i++) {
            String tmp = br.readLine();
            sum += map.get(tmp);
            map.remove(tmp);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int min = sum;
        int max = sum;
        for (int i=0; i<m-k; i++) {
            min += list.get(i);
            max += list.get(n-k-1-i);
        }
        System.out.print(min + " " + max);
    }
}