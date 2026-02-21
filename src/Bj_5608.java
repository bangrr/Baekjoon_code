import java.io.*;
import java.util.*;

public class Bj_5608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Character, Character> map = new HashMap<>();
        while (n-- > 0) {
            String s = br.readLine();
            map.put(s.charAt(0), s.charAt(2));
        }
        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            char ch = br.readLine().charAt(0);
            sb.append(map.getOrDefault(ch, ch));
        }
        System.out.print(sb);
    }
}