import java.io.*;
import java.util.*;

public class Bj_16600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long a = Long.parseLong(br.readLine());
        double b = Math.sqrt(a);
        System.out.print(b * 4);
    }
}
