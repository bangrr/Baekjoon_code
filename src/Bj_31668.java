import java.io.*;
import java.util.*;

public class Bj_31668 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        System.out.print(m/n*k);
    }
}