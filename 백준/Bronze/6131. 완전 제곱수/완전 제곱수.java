import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int size = 0; // 만족하는 쌍의 개수
		for (int i = 1; i <= 500; i++) {
			int A = i;
			for (int j = 1; j <= i; j++) {
				int B = j;
				if (A * A - B * B == N)
					size++;
			}
		}
		System.out.println(size);
	}
}