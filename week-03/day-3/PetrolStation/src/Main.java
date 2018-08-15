public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Station mol = new Station();

        mol.refill(ferrari);
        System.out.println("Station gas amount: " + mol.gasAmount);
        System.out.println("Capacity: " + ferrari.capacity + " litre\nGas amount: " + ferrari.gasAmount + " litre");
    }
}
