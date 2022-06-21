package PracticeOutofClass;

import org.w3c.dom.ls.LSOutput;

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] lotteryCard = {

                // {23,23,23}
                //{234,234,234}
                {20, 15, 7},
                {8, 7, 19},
                {7, 13, 47}
        };

        int[][] lotteryCard2 = new int[3][3];
        System.out.println(lotteryCard[0][0]);
//        lotterycard2[0][0] = 20;
//        lotterycard2[0][1] = 15;
//        lotterycard2[0][2] = 7;
//        lotterycard2[1][0] = 8;
//        lotterycard2[1][1] = 7;
//        lotterycard2[1][2] = 19;
//        lotterycard2[2][0] = 7;
//        lotterycard2[2][1] = 13;
//        lotterycard2[2][2] = 47;
        // [row] [column];
        System.out.println("-------------------");
        for(int i=0; i<3;i++){
            for(int j= 0; j<3; j++)
            {
                  System.out.println(lotteryCard[i][j]);
        }
    }
    }
}


