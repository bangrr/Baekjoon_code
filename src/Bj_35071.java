import java.io.*;
import java.util.*;

public class Bj_35071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d = Integer.parseInt(br.readLine());
        double r = d / 2.0;
        double line = Math.PI * r;
        System.out.print(line-d);
    }
}