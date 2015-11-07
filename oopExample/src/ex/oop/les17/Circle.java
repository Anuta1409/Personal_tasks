package ex.oop.les17;

/**
 * Created by Anna on 28.10.2015.
 */
public class Circle {

    private double r;
    private Point point;//создание обьекта одного класса в другом. Эта точка - центр круга

    public Circle(double r, Point point){
        this.r = r;
        this.point = point;
    }

    public double getR(){
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean verPoint(Point p){

        double x = p.getX();
        double y = p.getY();


        double d = Math.pow((point.getX()-x),2) + Math.pow((point.getY()-y),2);

        if (d <= Math.pow(r,2))return true; else return false;
    }




}
