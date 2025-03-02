import java.io.*;
import java.util.*;

public class Bj_7600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while (!(s = br.readLine()).equals("#")) {
            int[] alphabet = new int[26];
            for (char c : s.toLowerCase().toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    alphabet[c - 'a']++;
                }
            }
            sb.append(Arrays.stream(alphabet).filter(i -> i > 0).count()).append("\n");
        }
    }
}