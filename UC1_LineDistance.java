package Day_3_Assignment;

public class UC1_LineDistance {

	
	 /**
	 * as fan of geometry,i want to model a line based on a point cosisting of (x,y)
	 * co-ordinates using the cartesian system,so that i can calculate its length.
	 * **A length as 2 points (x1,y1) and (x2,y2)
	 * **Length of aline = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
	 */

	        public void CalDistance(int x1,int y1,int x2,int y2) {
	                double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	                System.out.println("Distance: "+distance);
	        }
	        public static void main(String[] args) {
	                // TODO Auto-generated method stub
	        	UC1_LineDistance lc = new UC1_LineDistance();
	                lc.CalDistance(1, 1, 5, 4);

	        }

	}

