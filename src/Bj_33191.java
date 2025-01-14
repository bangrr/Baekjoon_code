import java.io.*;
import java.util.*;

public class Bj_33191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int b = Integer.parseInt(br.readLine());
        if (Integer.parseInt(br.readLine()) <= b) {
            System.out.print("Watermelon");
        } else if (Integer.parseInt(br.readLine()) <= b) {
            System.out.print("Pomegranates");
        } else if (Integer.parseInt(br.readLine()) <= b) {
            System.out.print("Nuts");
        } else {
            System.out.print("Nothing");
        }
    }
}
