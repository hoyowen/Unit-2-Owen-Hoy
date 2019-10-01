import java.util.*;

class Geometry {
    public static void main(String[] args){

        Dictionary sides = new Hashtable();
        sides.put("hept", 7);
        sides.put("dec", 10);
        sides.put("dodec", 12);

        int radius = 5;

        final double pi = 3.14159265359;

        System.out.println("A Heptagon has " + sides.get("hept") + " sides.");
        System.out.println("A Decagon has "+ sides.get("dec") +" sides.");
        System.out.println("A Dodecagon has "+ sides.get("dodec") + " sides.");
        System.out.println("The circumference of a circle with a radius of " +
            radius + " is " + (2*pi*radius) + ".");
    }
}
