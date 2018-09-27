package com.jetbrains;

public class Temperatures {

    public static void main(String[] args) {
        System.out.println("Temperature Calculator");
        System.out.println(" ");
        System.out.println("The data provided are:");

        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;

        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;

        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;

        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 7; c++) {
                if (c == 6) {
                    System.out.print(temps[r][c]);
                } else {
                    System.out.print(temps[r][c] + ", ");
                }

            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("Based on that data, the following are the average temperatures for each day (Sun-Mon, respectively).");

        //c = day r = time
        for (int c = 0; c < 7; c++) {
            int sum1 = 0;
            for (int r = 0; r < 4; r++) {
                sum1 += temps[r][c];
            }
            float average1 = sum1 / 4;
            if (c == 6) {
                System.out.print(average1);
            } else {
                System.out.print(average1 + ", ");
            }
        }

        System.out.println(" ");
        System.out.println("Based on that data, the following are the average temperatures for each time (7am-7pm, respectively).");

        for (int r = 0; r < 4; r++) {
            int sum2 = 0;
            for (int c = 0; c < 7; c++) {
                sum2 += temps[r][c];
            }
            float average2 = sum2 / 7;
            if (r == 3) {
                System.out.print(average2);
            } else {
                System.out.print(average2 + ", ");
            }
        }

        System.out.println(" ");
        System.out.println("Based on that data, the following is the average temperature overall.");

        int sum3 = 0;
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 7; c++) {
                sum3 += temps[r][c];
            }
        }
        float average3 = sum3 / 28;
        System.out.println(average3);

    }
}