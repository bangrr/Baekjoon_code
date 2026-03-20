import java.io.*;
import java.util.*;

public class Bj_21875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        char ax = a.charAt(0);
        char ay = a.charAt(1);
        String b = br.readLine();
        char bx = b.charAt(0);
        char by = b.charAt(1);
        int dx = Math.abs(ax - bx);
        int dy = Math.abs(ay - by);
        System.out.print(Math.min(dx, dy) + " " + Math.max(dx, dy));
    }
}