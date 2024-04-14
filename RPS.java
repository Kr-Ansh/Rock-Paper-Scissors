package RPS;

import java.util.*;

public class RPS {
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int w=0;
        int l=0;

        for(int i=0;i<5;i++){
        int r = rd.nextInt(3);
        int x = sc.nextInt();

        //logic
        if(x==r) {
            System.out.println("Draw!!");
        }
        else if(x==0 && r==2 || x==1 && r==0 || x==2 && r==1) {
            System.out.println("You Won!!");
            w+=1;
        }
        else {
            System.out.println("You Lose!!");
            l+=1;
        }

        //Computer's choice
        if(r==0) {
            System.out.println("Computer choice: Rock");
        }
        else if(r==1) {
            System.out.println("Computer choice: Paper");
        }
        else {
            System.out.println("Computer choice: Scissor");
        }
        }

        //Score
        if(w>l){
            System.out.println("You won " + w + "/" + (l+w) + " times!!");
        }
        else if(w<l){
            System.out.println("Computer won " + l + "/" + (l+w) + " times!!");
        }
        else{
            System.out.println("It's a draw!!");
        }
               
        sc.close();
    }
    
}
