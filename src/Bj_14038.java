import java.io.*;
import java.util.*;

public class Bj_14038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 1;
        for (int i=0; i<6; i++) {
            String s = br.readLine();
            if (s.equals("W")) cnt++;
        }
        cnt = cnt/2;
        System.out.print(cnt == 0 ? -1 : cnt == 1 ? 3 : cnt == 2 ? 2 : 1);
    }
}