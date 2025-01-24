import java.io.*;
import java.util.*;

public class Bj_33247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int prev = 0;
        int amount = 0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int cur = Integer.parseInt(st.nextToken());
            int parent = Integer.parseInt(st.nextToken());
            int money = Integer.parseInt(st.nextToken());
            if (parent != prev) {
                System.out.print("INVALID");
                return;
            }

            amount += money;
            if (amount < 0) {
                System.out.print("NO_MONEY");
                return;
            }

            prev = cur;
        }
        System.out.print(amount);
    }
}
