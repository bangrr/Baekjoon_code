import java.io.*;
import java.util.*;

public class Bj_32651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        System.out.print(n <= 100000 && n % 2024 == 0 ? "Yes" : "No");
    }
}