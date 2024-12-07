import java.util.*;
import java.io.*;

public class Bj_9243 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String ia = "";
        for (int i = 0; i < a.length(); i++) {
            ia += (a.charAt(i) == '0' ? 1 : 0);
        }
        String b = br.readLine();

        if (n % 2 == 0 ? Objects.equals(a, b) : Objects.equals(ia, b)) {
            System.out.print("Deletion succeeded");
        } else {
            System.out.print("Deletion failed");
        }
    }
}
