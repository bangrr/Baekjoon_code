import java.io.*;
import java.util.*;

public class Bj_9253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        if (a.contains(c) && b.contains(c)) {
            System.out.print("YES");
        } else{
            System.out.print("NO");
        }
    }
}