package Booking;

public class Reservations implements Reservationy {
    private RandomString randomString = new RandomString(8);
    private int i;

    public Reservations(int i) {
        this.i = i;
    }

    public void booking() {
        for (int j = 0; j < this.i; j++) {
            System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
        }
    }

    @Override
    public String getDowBooking() {
        String[] days = {"MON", "THU", "WED", "SAT"};
        return days[(int) (Math.random() * 3)];
    }

    @Override
    public String getCodeBooking() {
        return randomString.nextString().toUpperCase();
    }
}
