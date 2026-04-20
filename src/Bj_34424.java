import java.io.*;
import java.util.*;

public class Bj_34424 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        System.out.print((n-1)*x);
    }
}