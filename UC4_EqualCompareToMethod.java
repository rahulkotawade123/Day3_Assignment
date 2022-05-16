package Day_3_Assignment;

public class UC4_EqualCompareToMethod {


		double x1, x2, y1, y2, p1, p2, t1, t2;; // line1 and line 2 points
		double line1_length, line2_length;

		// for line1
		public double line1_point(double x1, double x2, double y1, double y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;

			line1_length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // formula for length find
			return line1_length;
		}

		// for line2
		public double line2_point(double p1, double p2, double t1, double t2) {
			this.p1 = p1;
			this.p2 = p2;
			this.t1 = t1;
			this.t2 = t2;

			line2_length = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(t2 - t1, 2)); // formula for length find
			return line2_length;
		}

		public static void main(String[] args) {
			System.out.println("Welcome To Line Comparison Computation");
			UC4_EqualCompareToMethod ob = new UC4_EqualCompareToMethod();
			double l1 = ob.line1_point(3, 4, 4, 6); // paasing arguments
			System.out.println("lenght1 length: " + l1);

			double l2 = ob.line2_point(5, 9, 6, 8); // passing arguments
			System.out.println("lenth2 length: " + l2);

			// convert double to string for used compareTo java method
			String length1 = String.valueOf(l1);
			String length2 = String.valueOf(l2);

			double diff = length1.compareTo(length2); // java compareTo method used

			if (diff < 0) {
				System.out.println("length1 is less than length2 ");
			} else if (diff == 0) {
				System.out.println("length1 is equal to length2");
			} else if (diff > 0) {
				System.out.println("length1 is greater than length2");
			}
		}
	}

