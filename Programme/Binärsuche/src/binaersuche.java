public class binaersuche {


    private static int counter; 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] zahlen = {1,2,4,66,2,4,66};

        System.out.println(counter);

        if(sucheIterativ(2, zahlen)) {
            System.out.println("Hype gefunden");
        } else {
            System.out.println("Doch ned gfunden");
        }
        System.out.println("Schritte: " + counter);
    }


    public static boolean sucheIterativ(int zahl, int[] mList) {

        for(int i = 0; i < mList.length; i++) {
            counter = i;
            if(mList[i] == zahl) {
                return true;
            }
        }

        return false;
    }
}