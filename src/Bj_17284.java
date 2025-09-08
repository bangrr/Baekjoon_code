import java.io.*;
import java.util.*;

public class Bj_17284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int sum = 0;
        for (String string : s) {
            int num = Integer.parseInt(string);
            if (num == 1) {
                sum += 500;
            } else if (num == 2) {
                sum += 800;
            } else if (num == 3) {
                sum += 1000;
            }
        }
        System.out.println(5000-sum);
    }
}