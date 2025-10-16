import java.io.*;
import java.util.*;

public class Bj_9306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i=1; i<=t; i++) {
            String a = br.readLine();
            String b = br.readLine();
            sb.append("Case ").append(i).append(": ").append(b).append(", ").append(a).append("\n");
        }
        System.out.print(sb);
    }
}