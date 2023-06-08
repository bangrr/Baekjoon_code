import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_10993 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int n, h, w, c, r, y, x;
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		h = (1 << n) - 1;
		w = h * 2 - 1;
		arr = new char[h+1][w+1];
		c = (1 << n) - 1;
		r = c * 2 - 1;
		y = 1;
		x = 1;
		drawTriangle(y, x, n);
		printArray();
		System.out.print(sb.toString());
	}

	static void drawTriangle(int y, int x, int n) {
		if (n % 2 == 1) {
			for (int i = y; i <= y - 1 + c; i++) {
				for (int j = x; j <= x - 1 + r; j++) {
					if (i == y - 1 + c) {
						arr[i][j] = '*';
					} else if (j == x + r / 2 + i - y) {
						arr[i][j] = '*';
					} else if (j == x + r / 2 - i + y) {
						arr[i][j] = '*';
					} else {
						arr[i][j] = ' ';
					}
				}
			}
			if (n == 1) {
				return;
			}
		} else {
			for (int i = y; i <= y - 1 + c; i++) {
				for (int j = x; j <= x - 1 + r; j++) {
					if (i == y) {
						arr[i][j] = '*';
					} else if (j == x + i - y) {
						arr[i][j] = '*';
					} else if (j == x - 1 + r + y - i) {
						arr[i][j] = '*';
					} else {
						arr[i][j] = ' ';
					}
				}
			}
		}
		n -= 1;
		c = (1 << n) - 1;
		r = c * 2 - 1;
		if (n % 2 == 1) {
			y += 1;
			x += c+1;
		} else {
			y += c;
			x += c+1;
		}
		drawTriangle(y, x, n);
	}
	
	static void printArray() {
		if (n % 2 == 1) {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= h + i - 1; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		} else {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w - i + 1; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
	}
}