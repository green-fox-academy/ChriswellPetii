public class Station {
    int gasAmount;

    void refill(Car car) {
        this.gasAmount -= (int) car.capacity;
        car.gasAmount += (int) car.capacity;
        car.capacity -= car.gasAmount;
    }
}
