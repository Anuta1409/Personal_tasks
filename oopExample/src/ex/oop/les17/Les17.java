package ex.oop.les17;

public class Les17 {
    public static void main(String[] args){

        Point pointCircle = new Point(6,9);
        Circle circle = new Circle(5.5,pointCircle);

        Point[] point = new Point[10];

        /*определяем, находится ли каждая точка в кругу*/
        for (int i = 0; i < point.length; i++) {
            point[i] = new Point((int)Math.round(Math.random() * 10),(int)Math.round(Math.random()*10));

            boolean ft = circle.verPoint(point[i]);

            System.out.println("x="+point[i].getX()+"  y="+point[i].getY()+ "   ft="+ ft);



        }








    }
}
