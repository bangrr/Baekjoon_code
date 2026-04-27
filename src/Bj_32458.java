import java.io.*;
import java.util.*;

public class Bj_32458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.print(s.substring(0, s.indexOf(".")));
    }
}