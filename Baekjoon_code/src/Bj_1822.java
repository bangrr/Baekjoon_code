import java.util.*;
import java.io.*;

public class Bj_1822 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int nA = rd.nextInt();
        int nB = rd.nextInt();

        HashSet<Integer> set = new HashSet<>();
        // 집합 A에는 속하면서 집합 B에는 속하지 않는 원소 (이하 A-B 로 표현) 의 개수를 구하기 위해
        while (nA-- > 0) {
            set.add(rd.nextInt()); // set에 먼저 집합 A의 원소를 추가
        }
        while (nB-- > 0) {
            set.remove(rd.nextInt()); // 집합 A와 중복되는 집합 B의 원소를 제거
        }

        // A-B 원소의 개수 출력
        sb.append(set.size()).append("\n");
        // A-B 원소가 있다면 증가하는 순서로 출력
        if (!set.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list); // 오름차순 정렬
            for (int it : list) {
                sb.append(it).append(" ");
            }
        }
        System.out.print(sb);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}