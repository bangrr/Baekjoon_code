import java.io.*;
import java.util.*;

public class Bj_34281 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        System.out.print(w * l);
    }
}