import java.io.*;
import java.util.*;

public class Bj_20233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int aa = a + Math.max(0, (t - 30)) * x * 21;
        int bb = b + Math.max(0, (t - 45)) * y * 21;
        System.out.print(aa + " " + bb);
    }
}