import java.io.*;
import java.util.*;

public class Bj_26531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int a = Integer.parseInt(s.substring(0, 1));
        int b = Integer.parseInt(s.substring(4, 5));
        int c = Integer.parseInt(s.substring(8, 9));
        System.out.print(a + b == c ? "YES" : "NO");
    }
}