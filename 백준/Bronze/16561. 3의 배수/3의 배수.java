import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n/3 - 2; i++) {
			for (int j = 1; j <= n/3 - 1 - i; j++) {
				int k = n/3 - i - j;
				if(k >= 1) count++;
			}
		}
		System.out.println(count);
	}
}