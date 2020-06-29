package com.company.user;

public class User {
    String name;
    String lastName;
    public User(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }
        public void welcome()
    {
        System.out.println("Dzień dobry " + name + " " + lastName + "!");
        System.out.println("Życzę udanego losowania i wysokich wygranych!\nProszę podaj różne liczby z przedziału 1-20");
    }
}
