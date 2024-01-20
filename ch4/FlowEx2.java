package ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input;
        String tmp;

        System.out.print("숫자를 입력하세요:");
        tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);
        if(input==0)
            System.out.println("입력하신 숫자는 0입니다.");
        else
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        System.out.printf("입력하신 숫자는 " + input + "입니다.");
    }
}
