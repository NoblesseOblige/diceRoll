package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to Roll\nEnter 2 to exit");
        int input=sc.nextInt();
        dice firstDice=new dice();
        dice secondDice=new dice();
        while(true)
        {
            if (input == 1) {
                System.out.println(firstDice.roll());
                System.out.println(secondDice.roll());

            }
            else if (input==2)
            {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
            System.out.println("Enter 1 to Roll\nEnter 2 to exit");
            input=sc.nextInt();
        }


    }
}
