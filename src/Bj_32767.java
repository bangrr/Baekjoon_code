import java.io.*;
import java.util.*;

public class Bj_32767 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        double ans = Double.parseDouble(st.nextToken());
        while (st.hasMoreTokens()) {
            char op = st.nextToken().charAt(0);
            double su = Double.parseDouble(st.nextToken());
            if (op == '+') ans += su;
            else if (op == '-') ans -= su;
            else if (op == '*') ans *= su;
            else if (op == '/') ans /= su;
        }
        String str = String.format("%.3f", ans);
        sb.append("=================\n" +
                "|SASA CALCULATOR|\n");
        sb.append("|").append(" ".repeat(15-str.length()));
        sb.append(str).append("|\n");
        sb.append("-----------------\n" +
                "|               |\n" +
                "| AC         /  |\n" +
                "| 7  8  9    *  |\n" +
                "| 4  5  6    -  |\n" +
                "| 1  2  3    +  |\n" +
                "|    0  .    =  |\n" +
                "=================");
        System.out.print(sb);
    }
}