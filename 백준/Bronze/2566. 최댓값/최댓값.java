import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] table = new int[9][9];
		int max = 0;
		int r = 0;
		int c = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = sc.nextInt();
				max = Math.max(max, table[i][j]);
				if(max == table[i][j]) {
					r = i + 1;
					c = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(r + " " + c);
	}
}