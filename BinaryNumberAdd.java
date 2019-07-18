package com.anup.practise;

import java.util.Scanner;

public class BinaryNumberAdd {

	public static void main(String[] args) {
		long num1, num2;
		int i = 0, carry = 0;
		int[] sum = new int[10];
		
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter 1st binary number : ");
		num1 = s.nextLong();
		System.out.print("\nPlease enter 2nd binary number : ");
		num2 = s.nextLong();
		s.close();
		
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		while(num1!=0 || num2!=0) {
			sum[i++] = (int)((num1 % 10 + num2 % 10 + carry) % 2);
			carry = (int)((num1 % 10 + num2 % 10 +carry) / 2);
			num1 = num1 / 10;
			num2 = num2 / 10;
		}
		if(carry !=0) {
			sum[i++] = carry;
		}
		--i;
		
		System.out.print("Result : ");
		while(i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.println("\n");		
	}

}
