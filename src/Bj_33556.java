import java.io.*;
import java.util.*;

public class Bj_33556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String a = br.readLine();
        String b = br.readLine();
        if (a.equals("null")) {
            System.out.println("NullPointerException");
            System.out.println("NullPointerException");
        } else if (b.equals("null")) {
            System.out.println(false);
            System.out.println(false);
        } else {
            System.out.println(a.equals(b));
            System.out.println(a.equalsIgnoreCase(b));
        }
    }
}