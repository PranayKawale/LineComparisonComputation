package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	static int x1, x2, x3, x4,  y1, y2 , y3 ,y4;
	static double length1 , Length2;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program");
		LineComparison value = new LineComparison();
		value.enterValues1();
		value.enterValues2();
		value.setLength1();
		value.setLength2();
		System.out.println("Length of line 1 ::" + value.getLength1());
		System.out.println("Length of line 2 ::"+ value.getLength2());
		double a = value.getLength1();
		double b = value.getLength2();
		value.compareLines(a,b);
		value.equalLines(a, b);
	}	
	void compareLines(double a, double b) {

		if (Double.compare(a, b) == 0) {
			System.out.println("Length1 = Length2");
		}
		else if (Double.compare(a, b) < 0) {
			System.out.println("Length1 is less than Length2");
		}
		else {
			System.out.println("Length1 is greater than Length2");
		}

	}

	void equalLines(double a , double b) {
		String str1 = Double.toString(a);
		String str2 = Double.toString(b);
		System.out.println("Is length of line 1 = length of line 2  ");
		System.out.println(str1.equals(str2));
	}

	public void enterValues1() {
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

	public void enterValues2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x3: ");
		x3 = sc.nextInt();
		System.out.print("Enter x4: ");
		x4 = sc.nextInt();

		System.out.print("Enter y3: ");
		y3 = sc.nextInt();
		System.out.print("Enter y4: ");
		y4 = sc.nextInt();
	}

	public void setLength1(){
		length1 = Math.sqrt(((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
	}

	public double getLength1(){
		return length1;
	}
	public void setLength2(){
		Length2 = Math.sqrt(((x4 - x3) * (x4-x3)) + ((y4-y3) * (y4-y3)));
	}
	public double getLength2(){
		return Length2;
	}
}
