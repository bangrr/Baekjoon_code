import java.io.*;
import java.util.*;

public class Bj_3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println((1+n/2)*(1+(n+1)/2));
    }
}