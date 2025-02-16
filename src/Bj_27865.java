import java.io.*;
import java.util.*;

public class Bj_27865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<20000; i++) {
            System.out.println("? 1");

            String s = br.readLine();
            if (s.equals("Y")) {
                System.out.println("! 1");
                return;
            }
        }
    }
}
