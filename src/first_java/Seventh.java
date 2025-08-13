package first_java;

import java.util.Scanner;

public class Seventh {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base ");
		int b = sc.nextInt();
		System.out.print("Enter Exponat ");
		int e = sc.nextInt();
		
		int pow = (int)(Math.pow(b, e));
		
		
		System.out.print(pow);
		
	}
}
