import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num1 = N/10;
		int num2 = N%10;
		int count = 0;
			do {
				int sum = num1 + num2;
				num1 = num2;
				num2 = sum%10;
				count++;
			} while(num1*10 + num2 != N);
			
		System.out.println(count);
	}
}