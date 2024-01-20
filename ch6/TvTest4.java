package ch6;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        //int i = 0;
        //for (Tv tv : tvArr) {
        //    tv = new Tv();
        //    tv.channel = (i++) + 10;
        //    System.out.println(tv.channel);
        //}
        //i = 0;
        //for (Tv tv : tvArr) {
        //    tv.channelUp();
        //    System.out.printf("tvArr[%d].channel=%d%n", i++, tv.channel);
        //}

        for(int i = 0;i < tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }
        for(int i = 0; i < tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}

class Tv{
    String color;
    boolean power;
    int channel;

    void power() { power = !power;};
    void channelUp() {++channel;}
    void channelDown(){--channel;};
}
