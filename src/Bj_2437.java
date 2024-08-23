import java.io.*;
import java.util.*;

public class Bj_2437 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

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
        System.out.print(max + 1);
    }
}