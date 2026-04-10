import java.io.*;
import java.util.*;

public class Bj_31614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        System.out.print(h * 60 + m);
    }
}