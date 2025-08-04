import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x1 = 0; //근1
		int x2 = 0; //근2
		for (int i = -1000; i <= 1000; i++) {
			for (int j = -1000; j <= 1000; j++) {
				if(i+j == -2*A && i*j == B && i <= j) {
					x1 = i;
					x2 = j;
				}
			}
		}
		if(x1 == x2) { //중근일 때 
			System.out.println(x1);
		}else { //근이 2개일 때
			System.out.println(x1 + " " + x2);
		}
	}
}