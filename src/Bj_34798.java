import java.io.*;
import java.util.*;

public class Bj_34798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        int fh = Integer.parseInt(first.substring(0, first.indexOf(":")));
        int fm = Integer.parseInt(first.substring(first.indexOf(":")+1));
        String second = br.readLine();
        int sh = Integer.parseInt(second.substring(0, second.indexOf(":")));
        int sm = Integer.parseInt(second.substring(second.indexOf(":")+1));

        if (sh > fh || (sh == fh && sm > fm)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}