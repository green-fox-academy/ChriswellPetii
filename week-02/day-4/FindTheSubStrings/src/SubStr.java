public class SubStr {
    public static void main(String[] args) {
        int startIndex = 0;
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one
        //  Example:
        //System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        //System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
        String input = "Marvel's The Avengers (classified under the name Marvel Avengers Assemble in the United Kingdom and Ireland), or simply The Avengers, is a 2012 American superhero film based on the Marvel Comics superhero team of the same name, produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures.";
        String q = "Marvesdl";
        stringFinder(input, q, startIndex);
    }

    public static void stringFinder(String input, String q, int startIndex) {
        if (input.toLowerCase().contains(q.toLowerCase())) {
            startIndex = input.indexOf(q);
            System.out.println(startIndex);
        } else {
            System.out.println(-1);
        }

    }
}