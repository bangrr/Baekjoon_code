import java.io.*;
import java.util.*;

public class Bj_4583 {
    static HashMap<Character, Character> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        map = new HashMap<>();
        map.put('b', 'd');
        map.put('d', 'b');
        map.put('p', 'q');
        map.put('q', 'p');
        map.put('i', 'i');
        map.put('o', 'o');
        map.put('v', 'v');
        map.put('w', 'w');
        map.put('x', 'x');

        while (true) {
            String s = br.readLine();
            if (Objects.equals(s, "#")) break;

            if (!check(s)) {
                sb.append("INVALID\n");
                continue;
            }

            for (int i = s.length()-1; i >= 0; i--) {
                sb.append(map.get(s.charAt(i)));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
        }
        return true;
    }
}