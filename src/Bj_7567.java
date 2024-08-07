import java.io.*;
import java.util.*;

public class Bj_7567 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int h = 10;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                h +=5;
            } else {
                h += 10;
            }
        }
        System.out.print(h);
    }
}