import java.io.*;
import java.util.*;

public class Bj_33165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());
        System.out.print(t*v);
    }
}