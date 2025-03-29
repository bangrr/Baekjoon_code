import java.io.*;
import java.util.*;

public class Bj_33664 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long B = Long.parseLong(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String item = st.nextToken();
            long price = Long.parseLong(st.nextToken());
            map.put(item, price);
        }
        for (int i = 0; i < M; i++) {
            String item = br.readLine();
            B -= map.get(item);
        }

        if (B >= 0) {
            System.out.print("acceptable");
        } else {
            System.out.print("unacceptable");
        }
    }
}