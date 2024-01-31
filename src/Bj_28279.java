import java.io.*;

public class Bj_28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque28279 deque = new Deque28279();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			String arr[] = str.split(" ");
			switch (arr[0]) {
			case "1" :
				deque.push_front(Integer.parseInt(arr[1]));
				break;
			case "2" :
				deque.push_back(Integer.parseInt(arr[1]));
				break;
			case "3" :
				sb.append(deque.pop_front()).append("\n");
				break;
			case "4" :
				sb.append(deque.pop_back()).append("\n");
				break;
			case "5" :
				sb.append(deque.size()).append("\n");
				break;
			case "6" :
				sb.append(deque.isEmpty()).append("\n");
				break;
			case "7" :
				sb.append(deque.front()).append("\n");
				break;
			case "8" :
				sb.append(deque.back()).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
}

class Deque28279 {
	private int MAX = 1000000;
	private int[] deque;
	private int front;
	private int rear;
	
	public Deque28279() {
		front = rear = MAX;
		deque = new int[MAX*2+1];
	}
	
	public void push_front(int value) {
		deque[--front] = value;
	}
	
	public void push_back(int value) {
		deque[rear++] = value;
	}
	
	public int pop_front() {
		if (isEmpty() == 1) {
			return -1; 
		}
		return deque[front++];
	}
	
	public int pop_back() {
		if (isEmpty() == 1) {
			return -1; 
		}
		return deque[--rear];
	}
	
	public int size() {
		return rear - front;
	}
	
	public int isEmpty() {
		if (front == rear) {
			return 1;
		}
		return 0;
	}
	
	public int front() {
		if (isEmpty() == 1) {
			return -1; 
		}
		return deque[front];
	}
	
	public int back() {
		if (isEmpty() == 1) {
			return -1;
		}
		return deque[rear-1];
	}
}