import java.io.*;

public class Bj_29725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                switch (c) {
                    case 'P':
                        sum += 1;
                        break;
                    case 'N':
                    case 'B':
                        sum += 3;
                        break;
                    case 'R':
                        sum += 5;
                        break;
                    case 'Q':
                        sum += 9;
                        break;
                    case 'p':
                        sum -= 1;
                        break;
                    case 'n':
                    case 'b':
                        sum -= 3;
                        break;
                    case 'r':
                        sum -= 5;
                        break;
                    case 'q':
                        sum -= 9;
                        break;
                }
            }
        }
        System.out.print(sum);
    }
}