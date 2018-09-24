package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you, " + name);
        System.out.println("How old are you?");
        String age = input.nextLine();
        System.out.println("Oh, so you are " + age + " years old? Interesting.");
        Double random = Math.floor(Math.random() * 10) + 1;
        String thenumber = Double.toString(random);
        thenumber = thenumber.substring(0,1);
        boolean answer = false;
        String guess;
        while(!answer){
            System.out.println("Try and guess the integer I'm thinking of, from 1 to 10.");
            guess = input.nextLine();
            if(guess.equals(thenumber)){
                answer = true;
            } else {
                System.out.println("Oh, that was the wrong number! Try again.");
            }
        }
        System.out.println("Good job! You guessed the correct number! You deserve a cookie : )");
    }
}
