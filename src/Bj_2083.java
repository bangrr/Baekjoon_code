import java.io.*;
import java.util.*;

public class Bj_2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if (Objects.equals("#", name) && age == 0 && weight == 0) {
                break;
            }
            if (age > 17  || weight >= 80) {
                sb.append(name).append(" ").append("Senior\n");
            } else {
                sb.append(name).append(" ").append("Junior\n");
            }
        }
        System.out.print(sb);
    }
}