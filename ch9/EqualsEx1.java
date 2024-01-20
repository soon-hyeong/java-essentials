package ch9;

public class EqualsEx1 {
    public static void main(String[] args){
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("true!");
        else System.out.println("false!");

        v2 = v1;
        if(v1.equals(v2))
            System.out.println("true!");
        else System.out.println("false!");
    }
}

class Value{
    int value;

    Value(int value){
        this.value = value;
    }
}