package ch9;

import java.util.*;

public class RandomEx4 {
    final static int RECORD_NUM = 10;
    final static String TABLE_NAME = "TEST_TABLE";
    final static String[] CODE1 = {"010", "011", "017", "018", "019"};
    final static String[] CODE2 = {"남자", "여자"};
    final static String[] CODE3 = {"10대", "20대", "30대", "40대", "50대"};

    public static void main(String[] args){
        for(int i = 0; i < RECORD_NUM; i++){
            System.out.println(" INSERT INTO " + TABLE_NAME
            + " values ("
            + ", '" + getRandArr(CODE1) + "'"
            + ", '" + getRandArr(CODE2) + "'"
            + ", '" + getRandArr(CODE3) + "'"
            + ", '" + getRand(100, 200)
            + "); ");
        }
    }
    public static String getRandArr(String[] arr){
        Random random = new Random();
        return arr[random.nextInt(arr.length)];
    }
    public static int getRand(int start, int end){
        Random random = new Random();
        return random.nextInt(end - start) + start;
    }
}
