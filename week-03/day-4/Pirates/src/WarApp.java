public class WarApp {
    public static void main(String[] args) {
        Armada France = new Armada();
        Armada Spain = new Armada();

        if (Spain.war(France)){
            System.out.println("Spain win!");
        }else {
            System.out.println("France win!");
        }
    }
}
