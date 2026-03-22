import java.io.*;
import java.util.*;

public class Bj_32722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if ((a == 1 || a == 3) && (b == 6 || b == 8) && (c == 2 || c == 5)) {
            System.out.print("JAH");
        } else {
            System.out.print("EI");
        }
    }
}