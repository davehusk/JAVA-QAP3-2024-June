public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1.0f, 2.0f);
        System.out.println(p);

        MovablePoint mp = new MovablePoint(3.0f, 4.0f, 0.5f, 0.5f);
        System.out.println(mp);

        mp.move();
        System.out.println("After moving: " + mp);
    }
}
