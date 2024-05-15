import java.io.*;
import java.util.*;

public class Bj_31822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine().substring(0, 5);
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.equals(br.readLine().substring(0, 5))) cnt++;
        }
        System.out.print(cnt);
    }
}