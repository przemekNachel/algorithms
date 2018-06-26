package codecool;

public class HighestProduct {

    private int min1 = 0;
    private int min2 = 0;
    private int max1 = 0;
    private int max2 = 0;
    private int max3 = 0;

    public int get(int[] array) {
        for(int i : array) {
            if(i <= min1) {
                min2 = min1;
                min1 = i;
            } else if(i <= min2) {
                min2 = i;
            }
            if(i >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i >= max2) {
                max3 = max2;
                max2 = i;
            } else if(i >= max3) {
                max3 = i;
            }
        }
        return Math.max((min1 * min2 * max1), (max1 * max2 * max3));
    }
}
