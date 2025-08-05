import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		int result = 0;
		exit:
		for (int i = 0; i <= N/A; i++) {
			for (int j = 0; j <= N/A; j++) {
				for (int k = 0; k <= N/A; k++) {
					if(A*i + B*j + C*k == N) { //가능한 상황 존재할 경우 루프탈출
						result = 1;
						break exit;
					}
				}
			}
		}
		System.out.println(result);
	}
}