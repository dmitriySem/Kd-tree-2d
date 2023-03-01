package kdtree;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int num_points = 100;
        Point[] points = new Point[num_points];
        Random rd = new Random();

         KDTree kdTree = new KDTree();

        for (int i = 0; i < num_points; i++) {
            Point p = new Point(rd.nextDouble(), rd.nextDouble());
            kdTree.insert(p);
            points[i] = p;
        }
        int ii = rd.nextInt(((num_points) + 1));
        System.out.println(String.format("index: %d \n", ii));
        Point newarestPoint = kdTree.nearest(points[ii]).getPoint();
        System.out.println(String.format("Coordinats of required point (%f, %f) \n", points[ii].getX()-1, points[ii].getY()-1));
        System.out.println(String.format("Coordinats of nearested point (%f, %f) \n", newarestPoint.getX(), newarestPoint.getY()));
        System.out.println("___________________");
        for (Point point : points) {
            System.out.println(String.format("(%f, %f) \n", point.getX(), point.getY()));
        }
    }
}
