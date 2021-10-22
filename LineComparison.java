package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	static int x1, x2,  y1, y2;
	static double length;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program");
		LineComparison value = new LineComparison();
		value.enterValues();
		value.setLength();
		double length = value.getLength();
		System.out.println("The length of line :: " + length);

	}
	public void enterValues() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
		x1 = sc.nextInt();
		System.out.print("Enter x2: ");
		x2 = sc.nextInt();

		System.out.print("Enter y1: ");
		y1 = sc.nextInt();
		System.out.print("Enter y2: ");
		y2 = sc.nextInt();
	}


	public void setLength(){
		length = Math.sqrt(((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
	}
	public double getLength(){
		return length;
	}


}
