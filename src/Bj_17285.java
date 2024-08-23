import java.io.*;
import java.util.*;

public class Bj_17285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] arr = br.readLine().toCharArray();
        int key = 'C'^arr[0];
        System.out.println(key);
        for (int i = 0; i < arr.length; i++) {
            sb.append((char)(arr[i]^key));
        }
        System.out.print(sb);
    }
}