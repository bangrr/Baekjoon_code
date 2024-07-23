import java.io.*;

public class Bj_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final String F = "Fizz";
        final String B = "Buzz";

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        int ans = 0;

        if (!str1.contains(F) && !str1.contains(B)) {
            ans = Integer.parseInt(str1)+3;
        } else if (!str2.contains(F) && !str2.contains(B)) {
            ans = Integer.parseInt(str2)+2;
        } else if (!str3.contains(F) && !str3.contains(B)) {
            ans = Integer.parseInt(str3)+1;
        }

        if (ans % 3 == 0 && ans % 5 == 0) {
            System.out.print(F+B);
        } else if (ans % 3 == 0) {
            System.out.print(F);
        } else if (ans % 5 == 0) {
            System.out.print(B);
        } else {
            System.out.print(ans);
        }
    }
}