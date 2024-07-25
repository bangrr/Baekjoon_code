import java.io.*;

public class Bj_3024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        //문제해결
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;

                if (i+1 < n && i+2 < n) {
                    if (board[i][j] == board[i+1][j] && board[i][j] == board[i+2][j]) {
                        System.out.print(board[i][j]);
                        return;
                    }
                }
                if (j+1 < n && j+2 < n) {
                    if (board[i][j] == board[i][j+1] && board[i][j] == board[i][j+2]) {
                        System.out.print(board[i][j]);
                        return;
                    }
                }
                if (i+1 < n && i+2 < n && j-1 >= 0 && j-2 >= 0) {
                    if (board[i][j] == board[i+1][j-1] && board[i][j] == board[i+2][j-2]) {
                        System.out.print(board[i][j]);
                        return;
                    }
                }
                if (i+1 < n && i+2 < n && j+1 < n && j+2 < n) {
                    if (board[i][j] == board[i+1][j+1] && board[i][j] == board[i+2][j+2]) {
                        System.out.print(board[i][j]);
                        return;
                    }
                }
            }
        }
        System.out.print("ongoing");
    }
}