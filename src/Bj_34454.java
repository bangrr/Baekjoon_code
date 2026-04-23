import java.io.*;
import java.util.*;

public class Bj_34454 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        System.out.print(c * p >= n ? "yes" : "no");
    }
}