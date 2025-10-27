import java.io.*;
import java.util.*;

public class Bj_34644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char c = s.charAt(s.length() - 1);
        System.out.print(c == '0' ? "10" : c);
    }
}