import java.io.*;
import java.util.*;

public class Bj_35423 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'S') x++;
            else if (s.charAt(i) == 'L') y++;
        }
        System.out.print("SciCom".repeat(x)+"Love".repeat(y));
    }
}