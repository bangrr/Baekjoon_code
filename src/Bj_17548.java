import java.io.*;
import java.util.*;

public class Bj_17548 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        String s = br.readLine();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'e') cnt++;
        }
        System.out.print("h"+"e".repeat(cnt*2)+"y");
    }
}