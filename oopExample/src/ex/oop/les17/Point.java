package ex.oop.les17;

/**
 * Created by Anna on 28.10.2015.
 */
public class Point {

    private double x;
    private double y;

    /*»нициализируем переменные значени€ми переданными по конструктору*/
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /*ƒоступ к параметрам с помошью метода √етера*/
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

     /*»зминени€ параметров методом сетера*/
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
}
