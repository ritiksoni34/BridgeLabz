package first_java;

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		int Area = (int) (Math.PI * Math.pow(n1,2));
		System.out.print(Area);
	}
}
