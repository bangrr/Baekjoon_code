import java.io.*;
import java.util.*;

public class Bj_4446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String aiy = "aiyeouaiyeou";
        String bkx = "bkxznhdcwgpvjqtsrlmfbkxznhdcwgpvjqtsrlmf";

        String s;
        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isAlphabetic(ch)) {
                    boolean isCap = Character.isUpperCase(ch);
                    if (isCap) ch = Character.toLowerCase(ch);
                    char c;
                    if (aiy.lastIndexOf(ch) > -1) {
                        c = aiy.charAt(aiy.lastIndexOf(ch) - 3);
                    } else {
                        c = bkx.charAt(bkx.lastIndexOf(ch) - 10);
                    }
                    sb.append(isCap ? Character.toUpperCase(c) : c);
                } else {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}