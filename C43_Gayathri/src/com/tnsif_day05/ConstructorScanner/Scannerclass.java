package com.tnsif_day05.ConstructorScanner;
import java.util.Scanner;

public class Scannerclass {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in); // Syntax for the scanner class
			System.out.println("Enter your name:");
			String str = sc.nextLine();
			System.out.println("Your name is "+str);
	sc.close();
		}

	}




