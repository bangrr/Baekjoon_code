import java.io.*;
import java.util.*;

public class Bj_34553 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int sum = 1;
        int score = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) < s.charAt(i)) {
                score++;
            } else {
                score = 1;
            }
            sum += score;
        }
        System.out.print(sum);
    }
}