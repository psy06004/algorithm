import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		int a = 0; //10의자리 수 
		int b = 0; //1의자리 수 
		int minN = N - (N%100) + 100; //N의 최솟값 구하기 위한 기
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int x = N - (N%100) + 10*i + j;
				if(x % F == 0) {
					minN = Math.min(minN, x);
				}
			}
		}
		b = minN%10;
		a = ((minN-b)%100)/10;
		System.out.print(a);
		System.out.print(b);
	}
}