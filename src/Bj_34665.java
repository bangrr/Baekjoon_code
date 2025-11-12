import java.io.*;
import java.util.*;

public class Bj_34665 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        if (Objects.equals(a, b)) {
            System.out.print(0);
        } else {
            System.out.print(1550);
        }
    }
}