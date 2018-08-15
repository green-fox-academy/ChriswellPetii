public class Main {
    public static void main(String[] args) {
        Student geza = new Student();
        Teacher janiBa = new Teacher();
        geza.question(janiBa);
        janiBa.teach(geza);
    }
}
