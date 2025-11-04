import java.io.*;
import java.util.*;

public class Bj_31607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a+b == c || a+c == b || b+c == a) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}