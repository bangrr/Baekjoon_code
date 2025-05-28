import java.io.*;
import java.util.*;

public class Bj_33985 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.print(s.charAt(0)=='A'&&s.charAt(s.length()-1)=='B'?"Yes":"No");
    }
}