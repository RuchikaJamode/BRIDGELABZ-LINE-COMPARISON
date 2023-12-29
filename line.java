package com.bridgelabz.commandline;
import java.lang.Math;
public class line{

	private double x1, y1, x2, y2;
	
	private main start, end;
    public line(double x1, double y1, double x2, double y2){
		// TODO Auto-generated constructor stub
    	
	}

	
    public line(main start, main end) {
        this.start = start;
        this.end = end;
    }
	public void line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
	

    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
public boolean equals (line otherline) {
	  return this.x1 == otherline.x1 && this.y1 == otherline.y1 &&
              this.x2 == otherline.x2 && this.y2 == otherline.y2;
	  
	  
		
	}

public int compareTo(line otherline) {
    double thisLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double otherLength = Math.sqrt(Math.pow(otherline.x2 - otherline.x1, 2) + Math.pow(otherline.y2 - otherline.y1, 2));

    if (thisLength < otherLength) {
        return -1; // This line is shorter
    } else if (thisLength > otherLength) {
        return 1; // This line is longer
    } else {
        return 0; // Lines are equal in length
    }
}
    
          double calculateLength1() {
        double xDiff = end.getX() - start.getX();
        double yDiff = end.getY() - start.getY();{
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
          public int compareTo1(line otherline) {
              double thisLength = this.calculateLength();
              double otherLength = otherline.calculateLength();

              if (thisLength < otherLength) {
                  return -1; // This line is shorter
              } else if (thisLength > otherLength) {
                  return 1; // This line is longer
              } else {
                  return 0; // Lines are equal in length
              }
}
          public boolean equals(Object obj) {
              if (this == obj) {
                  return true;
              }
              if (!(obj instanceof line)) {
                  return false;
              }
              line otherline = (line) obj;
              return this.start.equals(otherline.start) && this.end.equals(otherline.end);
          }
      }





