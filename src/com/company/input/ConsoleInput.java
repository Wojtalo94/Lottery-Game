package com.company.input;

import com.company.user.User;

import java.util.Scanner;

public class ConsoleInput {
    static Scanner scanner = new Scanner(System.in);

    public static User getUserData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! Podaj proszę swoje imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj swoje nazwisko:");
        String lastName = scanner.nextLine();
        User user = new User(name, lastName);
        return user;
    }

    public static int[] getUserNumbers(int count)
    {
        int [] numbers = new int[count];
        for(int i = 0; i < numbers.length; i++) {

            System.out.println("Podaj " + (i+1) +" liczbę: ");
            numbers[i] = scanner.nextInt();
        }
        return  numbers;
    }

}
