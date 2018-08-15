public class Counter {
    int counter;
    int initCounter;

    Counter() {
        this.counter = 0;
         this.initCounter = 0;
    }
    Counter(int i){
        this.counter = i;
        this.initCounter = i;
    }

    public void add(int i) {
        counter += i;
    }

    public void add() {
        counter++;
    }

    public int get() {
        System.out.println("Current: " + counter);
        return counter;
    }

    public void reset() {
        this.counter = initCounter;
    }
}
