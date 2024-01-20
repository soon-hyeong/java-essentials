package ch7;

class Outer10{
    int value = 10;

    class Inner{
        int value = 20;

        void method1(){
            int value = 30;
            System.out.println("value :" + value);
            System.out.println("this.value :" + this.value);
            System.out.println("Outer10.this.value " + Outer10.this.value);
        }
    }
}
public class InnerEx5 {
    public static void main(String[] args){
        Outer10 outer = new Outer10();
        Outer10.Inner inner = outer.new Inner();
        inner.method1();
    }
}
