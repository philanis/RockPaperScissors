package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String [] plays = {r, p, s};
        String pcPlay;
        String yourPlay;

        int index;

        while(true){
            System.out.println("Make your move: ");
            yourPlay = scan.nextLine();

            index = random.nextInt(3);
            pcPlay = plays[index];

            System.out.println("Your play: " + yourPlay + " Computer's play: "+ pcPlay);

            if(yourPlay.equals(pcPlay)){
                System.out.println("It's a tie!");
            }else if(yourPlay.equals(r) && pcPlay.equals(s)){
                System.out.println("PC wins!");
            }else if(yourPlay.equals(s) && pcPlay.equals(p)){
                System.out.println("You win!");
            }else if(yourPlay.equals(p) && pcPlay.equals(r)){
                System.out.println("You win!");
            }else if(yourPlay.equals(r) && pcPlay.equals(p)){
                System.out.println("You win!");
            }else if(yourPlay.equals(s) && pcPlay.equals(r)){
                System.out.println("You win!");
            }else if(yourPlay.equals(p) && pcPlay.equals(s)) {
                System.out.println("PC wins!");
            }else{
                System.out.println("Invalid play");
            }
            System.out.println();
            System.out.println();

        }
    }
}