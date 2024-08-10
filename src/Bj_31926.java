import java.io.*;
import java.util.*;

public class Bj_31926 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int c = 0;
        while (n > 1) {
            n/=2;
            c++;
        }
        System.out.print(10 + c);
    }
}