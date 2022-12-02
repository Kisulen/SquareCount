package ru.netology.sqr;

public class SQRService {
    public int squareCount(int from, int to) {
        int counter = 0;
        int x = 10;
        for (int i = x; i <= 99; i++) {
            int square = i * i;
            for (int j = from; j <= to; j++) {
                if (square == j) {
                    counter++;
                }
            }

        }
        return counter;
    }
}
