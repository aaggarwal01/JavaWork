//package home;
import java.util.Scanner;
public class main {
	
		
	public static void printTable(int number){
		int i=1;
		while(i<=10){
			System.out.println(number + " * " + i + " = " + (number*i));
			i++;
		}
	}
		
	
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		//call table method
		System.out.print("Enter a Number to Print Table of : ");
		int number1 = sc.nextInt();
		printTable(number1);
	}
	

}
