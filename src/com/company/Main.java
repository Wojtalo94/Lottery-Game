package com.company;

import com.company.engine.LotteryEngine;
import com.company.input.ConsoleInput;
import com.company.user.User;

import java.util.Arrays;

public class Main {
    final static String TITLE = "LOTTERY GAME";
    public static void main(String[] args) {
        System.out.println(TITLE);
        User user1 = ConsoleInput.getUserData();
        user1.welcome();
        int count = 4;
        int[] userNumbers = ConsoleInput.getUserNumbers(count);
        System.out.println("Twoje wytypowane liczby: " + Arrays.toString(userNumbers));
        LotteryEngine lottery = new LotteryEngine(1, 20, count);
        int[] randomNumbers = lottery.getMultipleInts();
        System.out.println("Wylosowane liczby: " + Arrays.toString(randomNumbers));

        int correctTypes = lottery.getCountOfCorrectTypes(randomNumbers, userNumbers);
        System.out.println("Ilośc poprawnie wytypowanych liczb: " + correctTypes);
        switch (correctTypes)
        {
            case 0:
                System.out.println("Nie udało się tym razem ;(");
                break;
            case 1:
                System.out.println("Brawo trafiłeś(aś) 1 liczbę");
        }
    }
}
