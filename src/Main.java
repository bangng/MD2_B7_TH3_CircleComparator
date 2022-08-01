import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("============Square=============");
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(2.3);
//        System.out.println(square);
//        square = new Square("yellow",true,5.8);
//        System.out.println(square);

        System.out.println("=================Comparable=============");
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false,3.5);

        System.out.println("Pre-sorted:");
        for (Circle circle1 :
             circles) {
            System.out.println(circle1);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("Apter-sorted:");
        for (Circle circle :
             circles) {
            System.out.println(circle);
        }

    }

}
