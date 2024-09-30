import java.io.*;
import java.util.*;

public class Bj_13288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<Character, String> map = new HashMap<>();
        init(map);

        String s = br.readLine().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                sb.append(map.get(c));
            } else {
                sb.append(c);
            }
        }
        System.out.print(sb);
    }

    static void init(Map<Character, String> map){
        map.put('a', "@");
        map.put('b', "8");
        map.put('c', "(");
        map.put('d', "|)");
        map.put('e', "3");
        map.put('f', "#");
        map.put('g', "6");
        map.put('h', "[-]");
        map.put('i', "|");
        map.put('j', "_|");
        map.put('k', "|<");
        map.put('l', "1");
        map.put('m', "[]\\/[]");
        map.put('n', "[]\\[]");
        map.put('o', "0");
        map.put('p', "|D");
        map.put('q', "(,)");
        map.put('r', "|Z");
        map.put('s', "$");
        map.put('t', "']['");
        map.put('u', "|_|");
        map.put('v', "\\/");
        map.put('w', "\\/\\/");
        map.put('x', "}{");
        map.put('y', "`/");
        map.put('z', "2");
    }
}