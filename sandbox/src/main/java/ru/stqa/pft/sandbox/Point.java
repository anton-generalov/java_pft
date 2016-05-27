package ru.stqa.pft.sandbox;

/**
 * Created by ageneralov on 25.05.2016.
 */
public class Point {

  public double x;
  public double y;

  public static double distance(Point p1, Point p2) {
    return Math.sqrt( Math.pow( (p2.x - p1.x), 2 ) +  Math.pow( (p2.y - p1.y), 2 ) );
  }

  public static void main(String[] args) {

    Point p1 = new Point();
    p1.x = 0;
    p1.y = 0;

    Point p2 = new Point();
    p2.x = 3;
    p2.y = 4;

    System.out.println("Расстояние между точками равно " + distance(p1, p2));


    
    p1.x = 0;
    p1.y = 0;

    p2.x = 7;
    p2.y = 8;

    System.out.println("Расстояние между точками равно " + distance(p1, p2));

  }

}
