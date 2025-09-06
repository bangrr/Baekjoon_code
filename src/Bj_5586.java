import java.io.*;
import java.util.*;

public class Bj_5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int jc = 0, ic = 0;
        for (int i=2; i<arr.length; i++) {
            if (arr[i] == 'I' && arr[i - 1] == 'O') {
                if (arr[i - 2] == 'J') {
                    jc++;
                } else if (arr[i - 2] == 'I') {
                    ic++;
                }
            }
        }
        System.out.print(jc + "\n" + ic);
    }
}