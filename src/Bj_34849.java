import java.io.*;
import java.util.*;

public class Bj_34849 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.print(n*n > 100000000 ? "Time limit exceeded" : "Accepted");
    }
}