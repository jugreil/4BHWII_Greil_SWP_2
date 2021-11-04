
public class Recursive {

		
		public static void main(String[] args) {
			System.out.println(sum(5));
			System.out.println(sumIt(5));
		}
		
		public static int sum(int number) {
			if (number >=  1 ) {
				return number + sum (number -  1 );
			} else {
				return 0;
			}
		}
		
		public static int sumIt(int number) {
			int zahl = number;
			while(number > 0) {
				number --;
				zahl = zahl + number;
			}
			return zahl;
		}
		
		public static int fak(int number) {
			if (number >=  1 ) {
				return number * fak (number--);
			} else {
				return 1;
			}
		}
		
		public static int pow(int basis, int exponent) {
			if(exponent >= 1) {
				return basis * pow(basis, exponent--); 
			} else {
				return 1;
			}
		}
	}

