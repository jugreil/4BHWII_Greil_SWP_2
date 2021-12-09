import java.util.Random;

public class Sort {
	
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[100];
		for(int x = 0; x < 100; x++) {
			arr[x] = rand.nextInt(100);
			System.out.print(arr[x] + " ");
		}
		System.out.println();
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr.length -1 - x;y++) {
				if(arr[y]> arr[y+1]) {
					int zahl1 = arr[y];
					int zahl2 = arr[y+1];
					arr[y] = zahl2;
					arr[y+1]= zahl1;
				}
			}
		}
		for(int x = 0; x < arr.length; x ++) {
			System.out.print(arr[x] + " ");	
		}
	}
}
