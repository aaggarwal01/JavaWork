package home;

import java.util.Scanner;

public class TableWithLoop {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Table for:");
		int a = sc.nextInt();
		// System.out.println("Enter value for b");
		// int b= sc.nextInt();

//		for (int b = 1; b <= 10; b++) {
//			System.out.println(a + "x" + b + "=" + a * b);
//		}
		int b=1;
		while(b<=10) {
			System.out.println(a + "x" + b + "=" + a * b);
			b++;
		}

	}

}
