import java.io.*;
import java.util.*;

public class Bj_8673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(st.nextToken());
            if (t > 0) list.add(t);
        }
        Collections.sort(list);
        int len = list.size();
        int[] s = new int[len+1];
        for (int i=1; i<=len; i++) {
            s[i] = s[i-1] + list.get(i-1);
        }
        for (int i=1; i<=len; i++) {
            if ((s[len]-s[i-1])/(len+1-i) >= w) {
                System.out.print(i-1);
                return;
            }
        }
        System.out.print("NIE");
    }
}