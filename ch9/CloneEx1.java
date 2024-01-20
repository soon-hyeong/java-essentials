package ch9;

class Point implements Cloneable {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x=" + x + ", y=" + y;
    }
    public Point clone(){
        Point obj = null;
        try{
            obj = (Point)super.clone();
        } catch(CloneNotSupportedException e){}
        return obj;
    }
}
public class CloneEx1 {
    public static void main(String[] args){
        Point original = new Point(3, 5);
        Point copy = original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
