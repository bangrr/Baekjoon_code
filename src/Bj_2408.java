import java.io.*;
import java.util.*;
import java.math.*;

public class Bj_2408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String md = "*/";
        String as = "+-";
        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n*2-1; i++) {
            String s = br.readLine();
            list.add(s);

            if (md.contains(s)) cnt++;
        }

        while (list.size() > 1) {
            for (int i = 1; i < list.size(); i+=2) {
                String s = list.get(i);
                BigDecimal left = new BigDecimal(list.get(i-1));
                BigDecimal right = new BigDecimal(list.get(i+1));
                BigDecimal res;
                if (md.contains(s)) {
                    res = s.equals("*") ? left.multiply(right) : left.divide(right, RoundingMode.FLOOR);

                    list.set(i-1, String.valueOf(res));
                    list.remove(i+1);
                    list.remove(i);
                    cnt--;
                    i-=2;
                    if (cnt == 0) break;
                } else if (cnt == 0 && as.contains(s)) {
                    res = s.equals("+") ? left.add(right) : left.subtract(right);

                    list.set(i-1, String.valueOf(res));
                    list.remove(i+1);
                    list.remove(i);
                    i-=2;
                }
            }
        }
        System.out.print(list.get(0));
    }
}