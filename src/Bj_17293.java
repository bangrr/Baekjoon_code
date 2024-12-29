import java.io.*;
import java.util.*;

public class Bj_17293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 0; i--) {
            if (i > 1) {
                sb.append(String.format("%s bottles of beer on the wall, %s bottles of beer.\n" +
                        "Take one down and pass it around, %s of beer on the wall.", i, i, i-1 == 1 ? "1 bottle" : i-1 + " bottles"));
            } else if (i == 1) {
                sb.append(String.format("%s bottle of beer on the wall, %s bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.", i, i));
            } else {
                sb.append(String.format("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, %s of beer on the wall.", n == 1 ? "1 bottle" : n + " bottles"));
            }
            sb.append("\n");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
