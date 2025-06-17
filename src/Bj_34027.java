import java.io.*;
import java.util.*;

public class Bj_34027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i*i<=1000000000; i++) {
            list.add(i*i);
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(list.contains(n) ? "1\n" : "0\n");
        }
        System.out.print(sb);
    }
}