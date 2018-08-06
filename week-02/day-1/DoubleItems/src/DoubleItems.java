import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
        int[] numList = new int[]{3, 4, 5, 6, 7};
        numListDbld(numList);

        System.out.println(Arrays.toString(numList));


    }

    public static void numListDbld(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * 2;
        }
    }
}
