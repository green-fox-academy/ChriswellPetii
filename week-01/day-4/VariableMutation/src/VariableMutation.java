public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10


        System.out.println(a + 10);




        int b = 100;
        // make it smaller by 7


        System.out.println(b - 95);




        int c = 44;
        // please double c's value


        System.out.println(c * 2);




        int d = 125;
        // please divide by 5 d's value


        System.out.println(d / 5);




        int e = 8;
        // please cube of e's value


        System.out.println(e * e * e);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 < f2) {
            System.out.println(f1 < f2);

        }





        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if ((g2 *2) > g1) {
            System.out.println((g2 *2) > g1);
        }




        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h / 11 == 0) {
            System.out.println(h / 11 == 0);
        }





        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i2s = 3 * 3, i2c = 3 * 3 * 3;
        boolean bool = (i1 > i2s && i1 < i2c);
        System.out.println(bool);




        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        System.out.println(j / 3 == 0 || j / 5 == 0);



        String k = "Apple " + "Apple " + "Apple " + "Apple ";
        //fill the k variable with its content 4 times


        System.out.println(k);
    }
}