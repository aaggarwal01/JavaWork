import java.util.Scanner;

public class hr-practiceIfStatement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number = sc.nextInt();
		
		if((number%2 != 0)){
			System.out.print("Weird");
		}
		else if((number%2 == 0) && ((number>=2)&&(number<=5))){
			System.out.print("Not Weird");
		}
		else if((number%2 == 0) && ((number>=6)&&(number<=20))){
			System.out.print("Weird");
		}
		else if((number%2 == 0) && ((number>20))){
			System.out.print("Not Weird");
		}
	}
}