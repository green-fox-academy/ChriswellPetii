class Plant {
    private int getWaterAmount;
    private String color;
    private double absorbing;
    private static int limit;

    Plant(String color, int limit, double absorbing) {
        this.color = color;
        this.limit = limit;
        this.absorbing = absorbing;
        if (this.color.length() > 100) {
            throw new IllegalArgumentException("Wrong color");
        }
    }

    void watering(int water) {
        if (getWaterAmount <= limit) {
            water = (int) (water * absorbing);
            this.getWaterAmount += water;
        }
    }

    int getGetWaterAmount() {
        return getWaterAmount;
    }

    String getColor() {
        return color;
    }
}
