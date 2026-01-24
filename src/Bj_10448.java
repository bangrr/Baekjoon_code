import java.io.*;
import java.util.*;

public class Bj_10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int d = 0;
        int e = 1;
        List<Integer> list = new ArrayList<>();
        while (d < 1000) {
            d += e++;
            list.add(d);
        }
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            boolean flag = false;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    for (int l = 0; l < list.size(); l++) {
                        int sum = list.get(i) + list.get(j) + list.get(l);
                        if (sum == k) {
                            flag = true;
                        } else if (sum > k) {
                            break;
                        }
                    }
                }
            }
            sb.append(flag ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
}