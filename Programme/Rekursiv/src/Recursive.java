
public class Recursive {

		
		public static void main(String[] args) {
			
		}
		
		public static int sum(int number) {
			if (number >=  1 ) {
				return number + sum (number -  1 );
			} else {
				return 0;
			}
		}
		
		public static int faku(int number) {
			if (number >=  1 ) {
				return number * faku (number -  1 );
			} else {
				return 1;
			}
		}
		
		public static int powfak(int basis, int exponent) {
			if(exponent >= 1) {
				return basis * powfak(basis, exponent - 1); 
			} else {
				return 1;
			}
		}
	}

