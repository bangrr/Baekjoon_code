import java.io.*;
import java.util.*;

public class Bj_31023 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // main 메소드
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int p = Integer.parseInt(br.readLine());
            HashSet<String> set = new HashSet<>();
            while (p-- > 0) {
                set.add(br.readLine().toLowerCase());
            }
            int l = Integer.parseInt(br.readLine());
            int cnt = 0;
            int whole = 0;
            while (l-- > 0) {
                String s = br.readLine().toLowerCase() + ".";
                StringBuilder tmp = new StringBuilder();
                for (int i=0; i<s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                        tmp.append(s.charAt(i));
                    } else if (tmp.length() > 0) {
                        if (set.contains(tmp.toString())) {
                            cnt++;
                        }
                        whole++;
                        tmp.setLength(0);
                    }
                }
            }
            if (cnt * 100.0 >= whole * 75.0) {
                sb.append("It's a hit!\n");
            } else {
                sb.append("Delete immediately!\n");
            }
        }
        System.out.print(sb);
    }
}