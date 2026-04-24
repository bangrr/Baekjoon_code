import java.io.*;
import java.util.*;

public class Bj_33170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = a+b+c;
        System.out.print(d > 21 ? 0 : 1);
    }
}