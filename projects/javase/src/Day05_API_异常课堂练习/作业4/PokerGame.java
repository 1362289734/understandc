package Day05_API_异常课堂练习.作业4;

import java.util.*;

public class PokerGame {
    /**
     * 斗地主  需求:三人斗地主   四种花色  每种花色13张牌  大小王  地主20张  农民17张
     * 每一次重新启动程序   所有的牌都会被重洗
     * 要求:在控制台打印农民和地主的所有的牌
     */

    public static void Begin() {
        String[] strArr = new String[54];
        String temp;
        for (int i = 1; i < 55; i++) {
            if (i == 1 || i == 14 || i == 27 || i == 40) {
                temp = "A ";
            } else if (i == 11 || i == 24 || i == 37 || i == 50) {
                temp = "J ";
            } else if (i == 12 || i == 25 || i == 38 || i == 51) {
                temp = "Q ";
            } else if (i == 13 || i == 26 || i == 39 || i == 52) {
                temp = "K ";
            } else if (i == 53) {
                temp = "小王  ";
                strArr[i - 1] = temp;
            } else if (i == 54) {
                temp = "大王  ";
                strArr[i - 1] = temp;
            } else {
                if (i%13==10){
                temp = i%13+"";
                }
                else {
                    temp = i%13+" ";
                }
            }
            if (i <= 13) {
                strArr[i - 1] = "黑桃" + temp;
            } else if (i >= 14 && i < 27) {
                strArr[i - 1] = "红桃" + temp;
            } else if (i >= 27 && i < 40) {
                strArr[i - 1] = "梅花" + temp;
            } else if (i >= 40 && i < 53) {
                strArr[i - 1] = "方块" + temp;
            }
        }

        String[] player1 = new String[20], player2 = new String[17], player3 = new String[17];
        int j=0,number = 54;
        for (int i = 1; i < 55; i++) {
            String index;
            int n = (int)(Math.random()*number);
            number--;
            index = strArr[strArr.length-i];
            strArr[strArr.length-i] = strArr[n];
            strArr[n] = index;
            int a = strArr.length-i;
            if (i <= 17) {
                player2[j] = strArr[strArr.length-i];
                j++;
                if (j==17)j=0;
            } else if (i <= 34) {
                player3[j] = strArr[strArr.length-i];
                j++;
                if (j==17)j=0;
            } else {
                player1[j] = strArr[strArr.length-i];
                j++;
                if (j==20)j=0;
            }
        }
        display(player1);
        display(player2);
        display(player3);
    }
    public  static void display(String [] str){
        for (int i = 0; i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Begin();
    }
}
