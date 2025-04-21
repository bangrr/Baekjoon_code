import java.io.*;

public class Bj_6763 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        int over = speed - limit;

        if (over > 0) {
            int fee;
            if (over > 30) {
                fee = 500;
            } else if (over > 20) {
                fee = 270;
            } else {
                fee = 100;
            }
            System.out.print("You are speeding and your fine is $" + fee + ".");
        } else {
            System.out.print("Congratulations, you are within the speed limit!");
        }
    }
}