package satchaAmirah.practice;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String naame = input.nextLine();
		System.out.println();
		System.out.println();

		System.out.printf("Welcome %s%n", naame);

	}

}