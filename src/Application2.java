import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        int[] a = {9, 8, 6, -7, 3, 4};
    }

    public static int getMaaxFromArray(int[]array) {
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i; // comment
            }
        }
        return array[indexOfMax];
    }


}
