import java.io.*;
import java.util.*;

public class Bj_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int no = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
                if (sum > max) {
                    no = i+1;
                    max = sum;
                }
            }
        }
        System.out.print(no + " " + max);
    }
}
