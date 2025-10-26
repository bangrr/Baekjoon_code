import java.io.*;
import java.util.*;

public class Bj_15051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int min = 3000;
        if (b*2 + c*4 < min) min = b*2 + c*4;
        if (a*2 + c*2 < min) min = a*2 + c*2;
        if (a*4 + b*2 < min) min = a*4 + b*2;
        System.out.print(min);
    }
}