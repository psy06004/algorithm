import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int sheep = 1;
		int goat = 1;
		int count = 0; //가능한 해의 개수
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if(i+j == n && i*a + j*b == w) {
					sheep = i;
					goat = j;
					count++;
				}
			}
		}
		if(count == 1) {
			System.out.println(sheep + " " + goat);
		}else if(count == 0 || count >= 2) {
			System.out.println(-1);
		}
	}
}