import java.io.*;
import java.util.*;

public class Bj_3512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int bedroom, bathroom, kitchen, balcony, other;
        bedroom = bathroom = kitchen = balcony = other = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String t = st.nextToken();
            switch (t) {
                case "bedroom":
                    bedroom += a;
                    break;
                case "bathroom":
                    bathroom += a;
                    break;
                case "kitchen":
                    kitchen += a;
                    break;
                case "balcony":
                    balcony += a;
                    break;
                default:
                    other += a;
                    break;
            }
        }
        int sum = bedroom + bathroom + kitchen + balcony + other;
        System.out.println(sum);
        System.out.println(bedroom);
        System.out.print((sum - balcony/2.0) * c);
    }
}