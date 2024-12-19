import java.io.*;
import java.util.*;

public class Bj_25176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a = 1;
        while (n > 0) {
            a *= n--;
        }
        System.out.print(a);
    }
}
