import java.io.*;
import java.util.*;

public class Bj_6131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            list.add(i*i);
        }

        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j) - list.get(i) == n) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}