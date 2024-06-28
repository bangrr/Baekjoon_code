import java.io.*;
import java.util.*;

public class Bj_5637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line;
        String maxStr = "";
        while ((line = br.readLine().replaceAll("([^a-zA-Z\\-])", " ")) != null) {
            st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                if (Objects.equals("E-N-D", str)) {
                    System.out.println(maxStr.toLowerCase());
                    return;
                }
                if (maxStr.length() < str.length()) {
                    maxStr = str;
                }
            }
        }
    }
}