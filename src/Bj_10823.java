import java.io.*;
import java.util.*;

public class Bj_10823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        int sum = 0;
        int tmp = 0;
        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ',') {
                    sum += tmp;
                    tmp = 0;
                } else {
                    tmp *= 10;
                    tmp += s.charAt(i)-48;
                }
            }
        }
        sum += tmp;
        System.out.print(sum);
    }
}