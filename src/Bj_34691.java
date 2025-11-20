import java.io.*;
import java.util.*;

public class Bj_34691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("animal")) {
                sb.append("Panthera tigris\n");
            } else if (s.equals("tree")) {
                sb.append("Pinus densiflora\n");
            } else if (s.equals("flower")) {
                sb.append("Forsythia koreana\n");
            } else {
                break;
            }
        }
        System.out.print(sb);
    }
}