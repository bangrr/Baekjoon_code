import java.io.*;
import java.util.*;

public class Bj_34980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();
        if (a.equals(b)) {
            System.out.print("Good");
        } else {
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == 'w') c++;
                if (b.charAt(i) == 'w') c--;
            }
            System.out.print(c > 0 ? "Oryang" : c < 0 ? "Manners maketh man" : "Its fine");
        }
    }
}