public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double aSide = 24.5;
        double bSide = 24.5;
        double cSide = 24.5;
        int surfArea = (int) (aSide * bSide);
        int volume = (int) (surfArea * cSide);

        System.out.println("Surface Area: " + surfArea);
        System.out.println("Volume: " + volume);
    }

}
