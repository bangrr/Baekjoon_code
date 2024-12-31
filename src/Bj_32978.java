import java.io.*;
import java.util.*;

public class Bj_32978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            set.remove(st.nextToken());
        }
        System.out.print(set.toArray()[0]);
    }
}
