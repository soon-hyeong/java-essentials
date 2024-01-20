package ch7;

import java.util.Vector;

class Audio extends Product{
    Audio() { super(50);}
    public String toString() { return "Audio"; }
}

class Buyer1{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();
    int i = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    void refund(Product p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        }
        else{
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }
    void summary(){
        int sum = 0;
        String itemList = "";
        for(int i = 0; i<item.size();i++){
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum +"만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
public class PolyArgumentTest2 {
    public static void main(String[] args){
        Buyer1 b = new Buyer1();
        Tv10 tv = new Tv10();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.refund(com);
        b.summary();
    }
}
