import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		int b = 1;
		while(b < N) {
			b = b + a*6;
			a++;
		}
		System.out.println(a);
	}
}