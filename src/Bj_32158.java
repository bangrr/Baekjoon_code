import java.io.*;
import java.util.*;

public class Bj_32158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] arr = str.toCharArray();
        Queue<Integer> p = new LinkedList<>();
        Queue<Integer> c = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                p.add(i);
            }
            if (arr[i] == 'C') {
                c.add(i);
            }
            if (!p.isEmpty() && !c.isEmpty()) {
                arr[p.poll()] = 'C';
                arr[c.poll()] = 'P';
            }
        }
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }
        System.out.print(sb);
    }
}