import java.io.*;

public class Bj_21191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'W') {
                    col++;
                } else {
                    col--;
                }
                if (map[j][i] == 'W') {
                    row++;
                } else {
                    row--;
                }
                if (j < n-2 && map[i][j] == map[i][j+1] && map[i][j] == map[i][j+2]) {
                    flag = false;
                    break;
                }
                if (j < n-2 && map[j][i] == map[j+1][i] && map[j][i] == map[j+2][i]) {
                    flag = false;
                    break;
                }
            }
            if (col != 0 || row != 0 || !flag) {
                System.out.print(0);
                return;
            }
        }
        System.out.print(1);
    }
}