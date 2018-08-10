import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};
        int[] temp = {3, 4, 5, 6, 7};
        swap(aj, temp);
        System.out.println(Arrays.toString(aj));

    }

    private static void swap(int[] aj, int[] temp) {
        for (int i = 0; i < aj.length; i++) {
            aj[4 - i] = temp[0 + i];
        }
    }
}
