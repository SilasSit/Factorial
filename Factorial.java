/*
	Filename:Factorial.java
	Programmer: sit yan nap silas
	Description: cal n! by input the value of n 
*/

import java.util.Scanner;
public class Factorial {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		System.out.print("n? ");
		int n = sc.nextInt();
		for(int i=n; i >= 1; i--) {
			ans *= i;
		}
		System.out.println(n + "! = " + ans);
	}
}