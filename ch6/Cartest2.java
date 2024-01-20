package ch6;

class Car1{
    String color;
    String gearType;
    int door;
    Car1(){
        this("white", "auto", 4);
    }
    Car1(String color){
        this(color, "auto", 4);
    }
    Car1(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class Cartest2 {
    public static void main(String[] args){
        Car1 c1 = new Car1();
        Car1 c2 = new Car1("blue");
        System.out.println(c1.color + c1.gearType + c1.door);
        System.out.println(c2.color + c2.gearType + c2.door);
    }
}
