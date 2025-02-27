import java.io.*;

public class Bj_15921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(Integer.parseInt(br.readLine()) == 0 ? "divide by zero" : "1.00");
    }
}