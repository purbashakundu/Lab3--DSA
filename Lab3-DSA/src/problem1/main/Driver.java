package problem1.main;

import java.util.Scanner;

import problem1.service.BalancingBrackets;

public class Driver {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter brackets");
		String str=sc.nextLine();
		
		BalancingBrackets balancingBrackets = new BalancingBrackets();
	
		if(balancingBrackets.BalancingBrackets(str)) {
			System.out.println("The entered string has balanced brackets");
		}else {
			System.out.println("The entered string do not contain balanced brackets");
		}
	}
}
