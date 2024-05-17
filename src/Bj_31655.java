import java.io.*;
import java.util.*;

public class Bj_31655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), "/");
        int AA = Integer.parseInt(st.nextToken());
        int BB = Integer.parseInt(st.nextToken());
        int CCCC = Integer.parseInt(st.nextToken());

        if (AA <= 12 && BB <= 12) {
            System.out.print("either");
        } else if (AA <= 12) {
            System.out.print("US");
        } else if (BB <= 12) {
            System.out.print("EU");
        } else {
            System.out.print("neither");
        }
    }
}