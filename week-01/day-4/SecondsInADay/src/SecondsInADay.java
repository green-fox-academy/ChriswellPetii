public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int secondsofaday = 24 * 60 *60 *60;
        System.out.println(secondsofaday -((currentMinutes * 60) + (currentHours * 60 * 60) + currentSeconds) + " seconds left");
    }
}