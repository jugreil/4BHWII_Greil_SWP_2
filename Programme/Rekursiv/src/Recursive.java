
public class Recursive {
	
	private static long start; 
	private static long end; 
	
	public static void main(String[] args) {
	
		System.out.print("Hochfunktion rekursiv: ");
		start = System.nanoTime();
		long powRekursiv = pow(3,8);
		end = System.nanoTime();
		System.out.println(powRekursiv + ", berechnet in " + (end - start) / 1000 + " Millisekunden");

		System.out.print("Hochfunktion endrekursiv: ");
		start = System.nanoTime();
		long powEndrekursiv = powEnd(1, 3, 8);
		end = System.nanoTime(); 
		System.out.println(powEndrekursiv + ", berechnet in " + (end - start) / 1000 + " Millisekunden");

	}

	public static int sum(int number) {
		if (number >= 1) {
			return number + sum(number -1);
		}
		return 0;
		
	}
	public static int sumEnd(int sum, int i) {
		if (i >= 1) {
			System.out.println(i);
			return sumEnd(sum+i, i-1);
		}
		return sum;
	}

	public static int sumIt(int number) {
		int zahl = number;
		while (number > 0) {
			number--;
			zahl = zahl + number;
		}
		return zahl;
	}

	public static int fak(int number) {
		if (number >= 1) {
			return number * fak(number-1);
		} 
		return 1;
		
	}
	public static int fakEnd(int fak,int i) {
		if (i >= 1) {
			return fakEnd(fak * i,i-1);
		} 
		return fak;
	}

	public static int pow(int basis, int exponent) {
		if (exponent >= 1) {
			
			return basis * pow(basis, exponent - 1);
		}
		return 1;
		
	}
	public static int powEnd(int sum, int bas, int expo) {
		if (expo >= 1) {
			return powEnd(sum*bas,bas,expo-1);
		}
		
		return sum;
	}
}
