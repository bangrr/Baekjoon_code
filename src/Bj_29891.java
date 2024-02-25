import java.util.*;
import java.io.*;

public class Bj_29891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> po = new ArrayList<>();
        ArrayList<Integer> ne = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > 0) po.add(x);
            else if (x < 0) ne.add(-x);
        }
        Collections.sort(po);
        Collections.sort(ne);

        long ans = 0;
        for (int i=po.size()-1; i>=0; i-=k) {
            ans += po.get(i)<<1;
        }
        for (int i=ne.size()-1; i>=0; i-=k) {
            ans += ne.get(i)<<1;
        }
        System.out.print(ans);
    }
}