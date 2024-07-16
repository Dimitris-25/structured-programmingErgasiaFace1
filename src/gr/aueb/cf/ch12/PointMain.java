package gr.aueb.cf.ch12;

/**
 * driver class
 */

public class PointMain {
    public static void main(String[] args) {

        Point p1 = new Point(1,2);
        Point p2 = new Point(11,0);

        System.out.println("Point1 state");
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());


        System.out.println("Point2 state");
        System.out.println("X: " + p2.getX());
        System.out.println("X: " + p2.getY());

        System.out.printf("Total count of created points: " + Point.getNoOfPoints());



    }




}
