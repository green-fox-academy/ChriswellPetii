public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[] a = {1, 0, 0, 0};
        number(a);
    }


    public static void number(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}

