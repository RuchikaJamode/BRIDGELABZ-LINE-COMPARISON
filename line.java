package com.bridgelabz.commandline;
import java.lang.Math;
public class line {

	private double x1, y1, x2, y2;

    public line(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated constructor stub
	}

	public void Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}


