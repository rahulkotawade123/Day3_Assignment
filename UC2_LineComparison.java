package Day_3_Assignment;

public class UC2_LineComparison {

	public static void main(String arg[]) {
		int x1, x2, y1, y2;
		int p1, p2, t1, t2;
		
		double line1_length, line2_length;	
		x1 = 4;		y1 = 5;		x2 = 5;		y2 = 6;	
		p1 = 5;		p2 = 4;		t1 = 7;		t2 = 4;	
		
		line1_length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 		
		line2_length = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(t2 - t1, 2));	
		
		System.out.println("Welcome To Line Comparison Computation");
		String length1 = String.valueOf(line1_length);
		String length2 = String.valueOf(line2_length);
		double diff = length1.compareTo(length2);
		
		if (diff < 0) {
			System.out.println("length1 is less than length2");	
		}else if (diff == 0) {		
			System.out.println("length1 is equal length2");
		}else if (diff > 0) {
			System.out.println("length1 is greater than length2");
	}
}
}
