package com.bridgelabz.commandline;
import java.lang.Math;

public class Employee {

	public static void main(String[] args) {
		System.out.println("welcome to line comparision computational program");
	
	//UC1 is denoting 
	    double x1 = 6.0, y1 = 4.0;
        double x2 = 7.0, y2 = 5.0;

        line line1 = new line(x1, y1, x2, y2);
        double length = line1.calculateLength();

        System.out.println("Length of the line: " + length);
	
        //UC2 is denoting equality of two lines based on the end points
	
        line line1Line = new line(1, 0, 3, 4);
        line line2 = new line(0, 2, 3, 4);
        line line3 = new line(1, 1, 4, 5);

        System.out.println("Line 1 equals Line 2: " + line1Line.equals(line2)); // Should be true
        System.out.println("Line 1 equals Line 3: " + line1Line.equals(line3)); 
        
        
        //UC3 is denoting comparison of three lines based on the end points
        
	 line line4 = new line(0, 6, 3, 4);
     line line5 = new line(7, 0, 3, 4);
     line line6 = new line(1, 4, 4, 5);

     int comparison1_2 = line4.compareTo(line5);
     int comparison1_3 = line4.compareTo(line6);{

     if (comparison1_2 == 0) {
         System.out.println("Line 4 is equal to Line 5");
     } else if (comparison1_2 < 0) {
         System.out.println("Line 4 is shorter than Line 5");
     } else {
         System.out.println("Line 4 is longer than Line 5");
     }

     if (comparison1_3 == 0) {
         System.out.println("Line 4 is equal to Line 6");
     } else if (comparison1_3 < 0) {
         System.out.println("Line 4 is shorter than Line 6");
     } else {
         System.out.println("Line 4 is longer than Line 6");
     }
     
     //UC4 java OOP concepts
     
     main point1 = new main (0, 0);
     main  point2 = new main (3, 4);
      main  point3 = new main (1, 1);
      main point4 = new main (4, 5);

     line line7 = new line(point1, point2);
     line line8 = new line(point1, point2);
     line line9 = new line(point3, point4);

     // Using compareTo method to compare line lengths
     int comparison1_21 = line1.compareTo(line8);
     int comparison1_31 = line1.compareTo(line9);

     if (comparison1_21 == 0) {
System.out.println("Line 7 is equal to Line 8");
     } else if (comparison1_21 < 0) {
         System.out.println("Line 7 is shorter than Line 8");
     } else {
         System.out.println("Line7 is longer than Line 8");
     }

     if (comparison1_31 == 0) {
         System.out.println("Line 7 is equal to Line 9");
     } else if (comparison1_31 < 0) {
         System.out.println("Line 7 is shorter than Line 9");
     } else {
         System.out.println("Line 7 is longer than Line 9");
     }

     // Using equals method to check equality of lines
     System.out.println("Line 7 equals Line 8: " + line1.equals(line8)); // Should be true
     System.out.println("Line 7 equals Line 9: " + line1.equals(line9)); // Should be false
 }
}

	}

