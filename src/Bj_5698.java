import java.io.*;
import java.util.*;

public class Bj_5698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str;
        while (true) {
            str = br.readLine().toLowerCase();
            if (str.equals("*")) break;
            char ch = ' ';
            boolean chk = true;
            String[] arr = str.split(" ");
            for (int i=0; i<arr.length; i++) {
                if (ch == ' ') {
                    ch = arr[i].charAt(0);
                } else {
                    if (ch != arr[i].charAt(0)) {
                        chk = false;
                        break;
                    }
                }
            }
            if (chk) {
                sb.append("Y\n");
            } else {
                sb.append("N\n");
            }
        }
        System.out.print(sb);
    }
}