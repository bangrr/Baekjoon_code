import java.io.*;
import java.util.*;

public class Bj_33162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        System.out.print(x % 2 == 0 ? x / 2 : x / 2 + 3);
    }
}