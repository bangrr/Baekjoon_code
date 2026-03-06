import java.io.*;
import java.util.*;

public class Bj_27329 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.print(Objects.equals(s.substring(0, n/2), s.substring(n/2)) ? "Yes" : "No");
    }
}