public class IncrementElement {
    public static void main(String[] args) {
      /* Create an array variable named `t`
      with the following content: `[1, 2, 3, 4, 5]`
      - Increment the third element
      - Print the third element*/

      int[] t ={1, 2, 3, 4, 5};
      tThirdIncre(t);

        System.out.println(t[2]);

    }
    public static void tThirdIncre(int[] t) {

        t[2]++;

    }
}
