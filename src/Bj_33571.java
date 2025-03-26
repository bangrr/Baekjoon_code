import java.io.*;
import java.util.*;

public class Bj_33571 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String one = "AabDdegOoPpQqR@";

        int cnt = 0;
        String s = br.readLine().trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (one.contains(String.valueOf(c))) {
                cnt+=1;
            } else if (c == 'B') {
                cnt+=2;
            }
        }
        System.out.print(cnt);
    }
}