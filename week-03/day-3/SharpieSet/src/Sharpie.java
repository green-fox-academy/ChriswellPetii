public class Sharpie {
    String color;
    float width;
    float inkAmount;

    Sharpie(String color, float width,SharpieSet sharpieSet) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    void use() {
        this.inkAmount -= (Math.random() * 15);
    }
//    void delete(Sharpie sharpie){
//
//    }
}