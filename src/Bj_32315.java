import java.io.*;
import java.util.*;

public class Bj_32315 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        boolean[] chk = new boolean[10];
        String s = br.readLine().replaceAll("-", "");
        for (int i = 0; i < s.length(); i++) {
            chk[s.charAt(i)-48] = true;
        }
        int cnt = 0;
        for (boolean b : chk) {
            if (b) cnt++;
        }
        System.out.print(cnt);
    }
}