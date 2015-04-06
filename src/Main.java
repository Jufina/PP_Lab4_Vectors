/**
 * Created by Julia on 06.04.2015.
 */
public class Main {
    public static void main(String args[]) {
        Vector Axy = new Vector(2.0, 1.5, "A");
        Vector Axyz = new Vector(2.0, 1.5,-3,"B");
        Vector Some,Some2;
        Some=Vector.composeVector(2,-7,11,-5,"Some");
        Some2=Vector.composeVector(2,5,3,4,1,6,"Some2");

        System.out.println(Axy);
        System.out.println(Axyz);
        System.out.println(Some);
        System.out.println(Some2);

        Vector forMultiple;
        forMultiple=Axyz.multiple(-4,"forMultiple");
        System.out.println(forMultiple);
    }
}
