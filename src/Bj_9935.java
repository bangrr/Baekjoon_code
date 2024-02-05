import java.util.*;
import java.io.*;

public class Bj_9935 {
    static class BombChecker {
        char ch;
        int cnt;

        public BombChecker(char ch, int cnt) {
            this.ch = ch;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        String str = rd.nextLine();
        String bomb = rd.nextLine();

        Stack<BombChecker> stack = new Stack<>();
        stack.add(new BombChecker(' ', 0));
        int p = 0; // 폭발 문자열 위를 움직이는 포인터
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (bomb.charAt(p) == c) {
                BombChecker prev = stack.peek();
                int curCnt = prev.cnt + 1;
                stack.push(new BombChecker(c,  curCnt));
                p++;
                if (bomb.length() == curCnt) { // 폭발 성립하면 제거
                    while (curCnt-- > 0) {
                        stack.pop();
                    }
                    p = stack.peek().cnt;
                }
            } else if (bomb.charAt(0) == c) {
                stack.push(new BombChecker(c, 1));
                p = 1;
            } else {
                p = 0;
                stack.push(new BombChecker(c, 0));
            }
        }
        while (stack.size() > 1) {
            sb.append(stack.pop().ch);
        }
        if (sb.length() == 0) {
            System.out.print("FRULA");
        } else {
            System.out.print(sb.reverse());
        }
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
