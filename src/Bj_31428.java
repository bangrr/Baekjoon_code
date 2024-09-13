import java.io.*;
import java.util.*;

public class Bj_31428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().replaceAll(" ", "").toCharArray();
        char h = br.readLine().charAt(0);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == h) cnt++;
        }
        System.out.print(cnt);
    }
}