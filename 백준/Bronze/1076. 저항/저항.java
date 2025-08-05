import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] color = new String[3];
		for (int i = 0; i < 3; i++) {
			color[i] = sc.next();
		}
		long[] number = new long[3];
		for (int i = 0; i < 3; i++) {
			if(i<2) {
				if(color[i].equals("black")) number[i] = 0;
				if(color[i].equals("brown")) number[i] = 1;
				if(color[i].equals("red")) number[i] = 2;
				if(color[i].equals("orange")) number[i] = 3;
				if(color[i].equals("yellow")) number[i] = 4;
				if(color[i].equals("green")) number[i] = 5;
				if(color[i].equals("blue")) number[i] = 6;
				if(color[i].equals("violet")) number[i] = 7;
				if(color[i].equals("grey")) number[i] = 8;
				if(color[i].equals("white")) number[i] = 9;
			}else {
				if(color[i].equals("black")) number[i] = 1;
				if(color[i].equals("brown")) number[i] = 10;
				if(color[i].equals("red")) number[i] = 100;
				if(color[i].equals("orange")) number[i] = 1000;
				if(color[i].equals("yellow")) number[i] = 10000;
				if(color[i].equals("green")) number[i] = 100000;
				if(color[i].equals("blue")) number[i] = 1000000;
				if(color[i].equals("violet")) number[i] = 10000000;
				if(color[i].equals("grey")) number[i] = 100000000;
				if(color[i].equals("white")) number[i] = 1000000000;
			}
		}
		
		long result = (10*number[0] + number[1])*number[2];
		System.out.println(result);
	}
}
