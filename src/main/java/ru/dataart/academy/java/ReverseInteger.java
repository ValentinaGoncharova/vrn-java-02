package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        int tmp = inputNumber;
        int revers = 0;
        if (inputNumber < 0) {
            tmp = tmp * (-1);
        }
        while (tmp > 0) {
            revers = revers * 10;
            revers = revers + tmp % 10;
            tmp = tmp / 10;
        }
        if (inputNumber < 0) {
            revers *= -1;
        }

        return revers;
    }
}