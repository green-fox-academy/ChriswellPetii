public class SumElements {
    public static void main(String[] args) {
        // - Create an array variable named `r`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element

        int[] r = {54, 23, 66, 12};
        sum(r);
    }

    public static void sum(int[] r) {

        int st = r[1] + r[2];

        System.out.println(st);
    }
}
