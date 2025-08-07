import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] word = S.toCharArray(); //입력받은 String을 char배열로 바꿈
		int[] alArr = new int[26]; //알파벳 배열
		for (int i = 0; i < word.length; i++) { 
			for (int j = 0; j < alArr.length; j++) {
				if((int)word[i] == 97+j) { //a=97
					alArr[j]++;
				}
			}
		}
		for (int i = 0; i < alArr.length; i++) {
			System.out.print(alArr[i]+" ");
		}
	}
}