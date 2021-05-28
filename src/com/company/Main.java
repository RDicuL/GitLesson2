package com.company;

import java.util.Scanner;

public class Main {
    public static void branch4(){
        int a = 5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = input.nextLine();
        System.out.println();
        System.out.print(name);
    }
}
