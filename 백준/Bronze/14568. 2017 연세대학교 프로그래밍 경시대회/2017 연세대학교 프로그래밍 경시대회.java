import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= N; i++) { //택희
			for (int j = 1; j <= N-i; j++) { //영훈이 
				for (int j2 = 1; j2 <= N-i-j; j2++) { //남규
					if(i%2 == 0 && j+2 <= j2 && i+j+j2 == N) count++;
				}
			}
		}
		System.out.println(count);
	}
}