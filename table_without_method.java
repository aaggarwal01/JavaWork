//package home;
import java.util.Scanner;
public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print table: ");
		int number = sc.nextInt();
		
		for(int i = 1; i<=10;i++){
			int result = number*i;
			System.out.print(number);
			System.out.print(" * ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(result);
		}
	}
}
