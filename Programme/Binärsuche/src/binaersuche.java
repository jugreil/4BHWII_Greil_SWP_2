import java.util.Date;

class binaersuche {

	public static void main(String[] args) {
		long anzahl = 200000000;
		long[] zahlen = new long[(int) anzahl];
		for (long i = 0; i < anzahl; i++) {
			zahlen[(int)i] = i;
		}
		long gesucht = 200000001;

		boolean gefunden = binaereSuche(zahlen, gesucht);
		gefunden = sucheIterativ(gesucht, zahlen);
		if (gefunden) {
			System.out.println("Die Zahl ist enthalten");
		} else {
			System.out.println("So So da hasche wohl a zahl genommen de nit drein is");
		}
	}

	public static boolean binaereSuche(long[] myList, long zahl) {
		long start = System.currentTimeMillis();
		long low = 0;
		long high = myList.length - 1;
		long i = 0;
		while (low <= high) {
			i++;
			long index = (low + high) / 2;

			if (zahl == myList[(int) index]) {
				long ende= System.currentTimeMillis()-start;
				System.out.println(ende + "|" + i);
				return true;
			} else if (zahl < myList[(int) index]) {
				high = index - 1; // alle Zahlen höher wie der such index werden entfernt
			} else {
				low = index + 1; // alle Zahlen unter dem such index werden entfernt
			}
		}
		long ende= System.currentTimeMillis()-start;
		System.out.println(ende + "|" + i);
		return false;
	}
	
	public static boolean sucheIterativ(long zahl, long[] mList) {
		
		long start = System.currentTimeMillis();
        for(long i = 0; i < mList.length; i++) {
             
            if(mList[(int)i] == zahl) {
            	long ende = System.currentTimeMillis()-start;
				System.out.println(ende + "|" + i);
                return true;
            }
        }
        long ende= System.currentTimeMillis()-start;
		System.out.println(ende + "|" + mList.length);
        return false;
    }

}