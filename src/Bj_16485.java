import java.io.*;
import java.util.*;

public class Bj_16485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        System.out.print(c/b);
    }
}