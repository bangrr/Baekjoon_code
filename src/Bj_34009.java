import java.io.*;
import java.util.*;

public class Bj_34009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        if (n % 2 == 1) {
            System.out.print("Bob");
        } else {
            long alice = 0;
            long bob = 0;
            for (int i=0; i<(n+1)/2; i++) {
                bob += list.get(i);
            }
            for (int i=(n+1)/2; i<n; i++) {
                alice += list.get(i);
            }
            System.out.print(alice > bob ? "Alice" : "Bob");
        }
    }
}