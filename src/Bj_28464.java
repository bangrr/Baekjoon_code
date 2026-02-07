import java.io.*;
import java.util.*;

public class Bj_28464 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int p = 0;
        int q = n-1;
        int psum = 0;
        int qsum = 0;
        while (true) {
            qsum += list.get(q--);
            if (p > q) {
                break;
            }
            psum += list.get(p++);
            if (p > q) {
                break;
            }
        }
        System.out.print(psum + " " + qsum);
    }
}