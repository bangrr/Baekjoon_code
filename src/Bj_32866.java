import java.io.*;
import java.util.*;

public class Bj_32866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        double n = Double.parseDouble(br.readLine());
        double x = Double.parseDouble(br.readLine());
        double r = n * (100 - x) / 100;
        System.out.print((n - r) / r * 100);
    }
}