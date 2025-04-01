import java.io.*;
import java.util.*;

public class Bj_33689 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            if (s.startsWith("C")) cnt++;
        }
        System.out.print(cnt);
    }
}