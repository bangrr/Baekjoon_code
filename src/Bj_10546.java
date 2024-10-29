import java.io.*;
import java.util.*;

public class Bj_10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map  = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                map.put(s,map.get(s)+1);
            } else {
                map.put(s,1);
            }
        }
        for (int i = 0; i < n-1; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                if (map.get(s) > 1) {
                    map.put(s,map.get(s)-1);
                } else {
                    map.remove(s);
                }
            }
        }
        for (String key : map.keySet()) {
            System.out.print(key);
        }
    }
}