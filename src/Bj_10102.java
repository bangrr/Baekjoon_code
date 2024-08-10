import java.io.*;
import java.util.*;

public class Bj_10102 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int v = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int n = 0;
        for (int i = 0; i < v; i++) {
            char c = s.charAt(i);
            if (c == 'A') n++;
            else if (c == 'B') n--;
        }
        System.out.print(n > 0 ? "A" : n < 0 ? "B" : "Tie");
    }
}