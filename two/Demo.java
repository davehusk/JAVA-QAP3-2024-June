public class Demo {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        Circle c = new Circle(5.0);
        Circle c1 = new Circle(5.0, "blue", true);
        Rectangle r = new Rectangle(2.0, 3.0);
        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        Square sq = new Square(4.0);
        Square sq1 = new Square(4.0, "yellow", true);

        System.out.println(s);
        System.out.println(c);
        System.out.println(c1);
        System.out.println("Circle c area: " + c.getArea() + " perimeter: " + c.getPerimeter());
        System.out.println("Circle c1 area: " + c1.getArea() + " perimeter: " + c1.getPerimeter());
        System.out.println(r);
        System.out.println(r1);
        System.out.println("Rectangle r area: " + r.getArea() + " perimeter: " + r.getPerimeter());
        System.out.println("Rectangle r1 area: " + r1.getArea() + " perimeter: " + r1.getPerimeter());
        System.out.println(sq);
        System.out.println(sq1);
        System.out.println("Square sq area: " + sq.getArea() + " perimeter: " + sq.getPerimeter());
        System.out.println("Square sq1 area: " + sq1.getArea() + " perimeter: " + sq1.getPerimeter());
    }
}
