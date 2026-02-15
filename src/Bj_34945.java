import java.io.*;
import java.util.*;

public class Bj_34945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print((n+2) >= 8 ? "Success!" : "Oh My God!");
    }
}