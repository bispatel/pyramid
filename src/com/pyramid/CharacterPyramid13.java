package com.pyramid;

import java.util.Scanner;

public class CharacterPyramid13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		sc.close();
		if(ch>='a' && ch<='z') {
			ch = (char) (ch-32);
		}
		
		for(char c=ch;c>='A';c--) {			
			for(char c1='A';c1<=c;c1++) {
				System.out.print(c1);
			}
							
			System.out.println();	
		}
		
		
	}

	
}
