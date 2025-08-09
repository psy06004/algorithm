import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int[] num = new int[26];
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) >= 'a')
				num[(int)word.charAt(i)-'a']++;
			else
				num[(int)word.charAt(i)-'A']++;
		}
		int max = 0;
		int a = 0;
		char result = '?';
		for (int i = 0; i < num.length; i++) {
			max = Math.max(max, num[i]);
			if(max == num[i]) a=i;
		}
		result = (char)(a + 'A');
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(max == num[i]) {
				count++;
				if(count >= 2) {
					result = '?';
					break;
				}
			}
		}
		System.out.println(result);
	}
}