public class SumAll {
    public static void main(String[] args) {
        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`
        int[] ai = {3, 4, 5, 6, 7};
        int sum = 0;
        sum = sumElements(ai, sum);
        System.out.println(sum);
    }

    private static int sumElements(int[] ai, int sum) {
        for (int i = 0; i < ai.length; i++) {
            sum += ai[i];


        }
        return sum;
    }

}
