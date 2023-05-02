//package home;
import java.util.Scanner;
public class main {
	public static void printTable(int num){
		
		for(int i = 1; i<=10;i++){
			int result = num*i;
			System.out.print(num);
			System.out.print(" * ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(result);
		}
	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print table: ");
		int number = sc.nextInt();
		printTable(number);
		
		}
	}
