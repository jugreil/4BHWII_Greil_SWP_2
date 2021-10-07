import java.util.Date;
import java.util.Scanner;

class binaersuche {

	static int counter = 0;
	static long ende;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie viele zahlen sollen in Ihr Array");
		int anzahl = Integer.parseInt(scanner.next());
		System.out.println("Welche zahl wollen sie nun finden");
		int gesucht = Integer.parseInt(scanner.next());
		int[] zahlen = arrayFiller(anzahl);
		boolean gefunden = binaereSuche(zahlen, gesucht);
		System.out.println(ende + "|" + counter);
		gefunden = sucheIterativ(gesucht, zahlen);
		System.out.println(ende + "|" + counter);
		if (gefunden) {
			System.out.println("Die Zahl ist enthalten");
		} else {
			System.out.println("So So da hasche wohl a zahl genommen de nit drein is");
		}
	}

	public static boolean binaereSuche(int[] myList, int zahl) {
		long start = System.currentTimeMillis();
		int low = 0;
		int high = myList.length - 1;
		while (low <= high) {
			counter++;
			int index = (low + high) / 2;

			if (zahl == myList[(int) index]) {
				ende = System.currentTimeMillis() - start;
				return true;
			} else if (zahl < myList[(int) index]) {
				high = index - 1; // alle Zahlen höher wie der such index werden entfernt
			} else {
				low = index + 1; // alle Zahlen unter dem such index werden entfernt
			}
		}
		 ende = System.currentTimeMillis() - start;
		
		return false;
	}

	public static boolean sucheIterativ(int zahl, int[] mList) {

		long start = System.currentTimeMillis();
		for (int i = 0; i < mList.length; i++) {
			counter++;
			if (mList[(int) i] == zahl) {
				 ende = System.currentTimeMillis() - start;
				
				return true;
			}
		}
		 ende = System.currentTimeMillis() - start;
		return false;
	}

	boolean binarySearch(int arr[], int low, int high, int search) {
		if (high >= low) {
			int index = (low + high) / 2;
			if (arr[index] == search) {
				return true;
			}
			if (arr[index] > search) {
				return binarySearch(arr, low, index - 1, search);
			}
			return binarySearch(arr, index + 1, high, search);
		}

		return false;
	}

	public static int[] arrayFiller(int anzahl) {
		int[] zahlen = new int[(int) anzahl];
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[(int) i] = i + 1;
		}
		return zahlen;
	}

	public void arrayPrinter(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}