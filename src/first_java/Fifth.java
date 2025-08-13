package first_java;

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius ");
		int n1 = sc.nextInt();
		System.out.print("Enter hight ");
		int h = sc.nextInt();
		
		int Volume = (int) (Math.PI * Math.pow(n1,2)*h);
		System.out.print(Volume);
	}

}
