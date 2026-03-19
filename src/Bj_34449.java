import java.io.*;
import java.util.*;

public class Bj_34449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double d = Double.parseDouble(br.readLine());
        double w = Double.parseDouble(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.print(d * 3.14159 >= w * n ? "YES" : "NO");
    }
}