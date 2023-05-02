//package home;
import java.util.Scanner;
public class main {
	
	
	public static void main(String args[]) {
		System.out.println("Print Series:");
		for(int i = 1; i <= 10; i++){
			System.out.print(i);
			if(i%2 == 0){
				System.out.println("\t" + "Even");
			}
				else{
					System.out.println("\t" + "Odd");
			}
			
			
		}
		
	
	}
	

}
