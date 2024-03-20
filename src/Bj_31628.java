import java.util.*;
import java.io.*;

public class Bj_31628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[][] arr = new String[10][10];

        for (int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<10; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        for (int i=0; i<10; i++) {
            String s = arr[i][0];
            int c = 1;
            for (int j=1; j<10; j++) {
                if (arr[i][j].equals(s)) c++;
            }
            if (c == 10) {
                System.out.println(1);
                return;
            }
        }

        for (int i=0; i<10; i++) {
            String s = arr[0][i];
            int c = 1;
            for (int j=1; j<10; j++) {
                if (arr[j][i].equals(s)) c++;
            }
            if (c == 10) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}