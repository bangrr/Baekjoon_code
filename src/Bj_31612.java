import java.io.*;
import java.util.*;

public class Bj_31612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == 'j' || s.charAt(i) == 'i') {
                sum += 2;
            } else {
                sum += 1;
            }
        }
        System.out.print(sum);
    }
}