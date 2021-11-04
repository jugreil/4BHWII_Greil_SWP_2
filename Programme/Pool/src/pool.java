
public class pool {
	public static void main(String[] args) {
		int x = 17;
		int n = 8;
		int[] reihe = { 7, 2, 3, 1, 8, 4, 5, 6 };

		System.out.println(isVolume(x,n,reihe));
		int[] right = getRightVolume(n, x);
		for(int i = 0; i<n;i++) {
			System.out.print(right[i]+" | ");
		}
	}
	public static int isVolume(int x, int n, int[] reihe) {
		int highest = 0;
		int volume = 0;
		for (int i = 0; i < reihe.length; i++) {
			if (highest < reihe[i]) {
				highest = reihe[i];
			} else if (highest != n) {
				volume = volume + (highest - reihe[i]);
			} else {
				break;
			}
		}
		highest = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (highest < reihe[i]) {
				highest = reihe[i];
			} else if (highest != n) {
				volume = volume + (highest - reihe[i]);
			} else {
				break;
			}
		}
		volume = volume -x;
		if(volume < 0) {
			volume = volume * (-1);
		}
		return volume;
	
	}
	public static int[] getRightVolume(int n, int x) {
		 	int[] rightVolume = new int[n];
		 	int currentVolume = 0;
		 	int lastLow = 0;
		 	int finisher = 0;
		 	int lastPosition = 0;
		 	
		 	rightVolume[0] = n;
		 	
		 	for(int i = 1; i<n; i++) {
		 		if(x >= (n-(1+i))) {
		 			rightVolume[i]=i;
		 			x = x -(n-(1+i));
		 			lastLow = i;
		 		}
		 		else{
		 			finisher = (n-1) - x;
		 			rightVolume[i] = finisher;
		 			rightVolume[i + 1]= n-1;
		 			lastPosition = i+2;
		 			break;
		 		}
		 	}
		 	if(lastLow == (finisher -1)) {
		 		return rightVolume;
		 	}
		 	else if(lastLow>= finisher) {
		 		return null;
		 	}
		 	for(int i = n - 2; i > lastLow; i--) {
		 		if(i != finisher) {
		 			rightVolume[lastPosition]= i;
		 			lastPosition++;
		 		}
		 	}
		 	return rightVolume;	
	}
}