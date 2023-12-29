package com.bridgelabz.commandline;
import java.lang.Math;

public class Employee<Point> {

	public static void main(String[] args) {
		System.out.println("welcome to line comparision computational program");
	
	//UC1 is denoting 
	    double x1 = 6.0, y1 = 4.0;
        double x2 = 7.0, y2 = 5.0;

        line line1 = new line(x1, y1, x2, y2);
        double length = line1.calculateLength();

        System.out.println("Length of the line: " + length);
	
        //UC2 is denoting equality of two lines
	
        line line1Line = new line(0, 0, 3, 4);
        line line2 = new line(0, 0, 3, 4);
        line line3 = new line(1, 1, 4, 5);

        System.out.println("Line 1 equals Line 2: " + line1Line.equals(line2)); // Should be true
        System.out.println("Line 1 equals Line 3: " + line1Line.equals(line3)); 
	}
	
	

}
