import java.io.*;
import java.util.*;

public class Bj_5340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        sb.append("Latitude ").append(getLength(br));
        sb.append(":").append(getLength(br));
        sb.append(":").append(getLength(br)).append("\n");
        sb.append("Longitude ").append(getLength(br));
        sb.append(":").append(getLength(br));
        sb.append(":").append(getLength(br)).append("\n");

        System.out.print(sb);
    }

    private static int getLength(BufferedReader br) throws IOException {
        return br.readLine().trim().length();
    }
}
