import java.io.*;

public class Bj_6830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        String ans = "";

        String s;
        while ((s = br.readLine()) != null) {
            String city = s.substring(0, s.indexOf(' '));
            int temp = Integer.parseInt(s.substring(s.indexOf(' ')+1));
            if (temp < min) {
                min = temp;
                ans = city;
            }
        }
        System.out.print(ans);
    }
}