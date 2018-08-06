public class CompareLength {
    public static void main(String[] args) {
        // - Create an array variable named `p1`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `p2`
        //   with the following content: `[4, 5]`
        // - Print if `p2` has more elements than `p1`

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        p1op2(p1, p2);

    }

    public static void p1op2(int[] p1, int[] p2) {

        if (p2.length > p1.length) {
            for (int i = 0; i < p2.length; i++) {
                System.out.print(p2[i] + " ");
            }

        } else {
            for (int j = 0; j < p1.length; j++) {
                System.out.print(p1[j] + " ");
            }
        }
    }
}
