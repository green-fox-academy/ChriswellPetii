public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int codedaily = 6, semester = 17, dailyhours = 9, workdays = 5, avaragewhw = 52;

        System.out.println("Attendee spend " + semester * workdays * codedaily + " hours to code");
        System.out.println(((codedaily * workdays) / 52.) * 100  + "% per week");

    }
}