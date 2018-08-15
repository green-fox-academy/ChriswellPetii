public class Sharpie {
    String color;
    float width;
    float inkAmunt;

    Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmunt = 100;
    }
    void use(){
        this.inkAmunt -= (Math.random() * 15);
    }
}
