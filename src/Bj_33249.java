import java.io.*;
import java.util.*;

public class Bj_33249 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        double d = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());

        double c = d + 10;
        double r = c / 2;
        System.out.print(Math.PI * (c * h + r * r));
    }
}
