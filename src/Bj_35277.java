import java.io.*;
import java.util.*;

public class Bj_35277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 900+60+600+170+160+110;
        System.out.print(n / sum);
    }
}