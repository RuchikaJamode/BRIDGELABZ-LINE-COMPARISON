package com.bridgelabz.commandline;
import java.lang.Math;

public class Employee {

	public static void main(String[] args) {
		System.out.println("welcome to line comparision computational program");
	
	//uc1
	    double x1 = 6.0, y1 = 4.0;
        double x2 = 7.0, y2 = 5.0;

        line line1 = new line(x1, y1, x2, y2);
        double length = line1.calculateLength();

        System.out.println("Length of the line: " + length);
	
	}
	
	

}
