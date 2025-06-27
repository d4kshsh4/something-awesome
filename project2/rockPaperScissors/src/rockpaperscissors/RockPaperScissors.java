/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissors;
import java.util.Scanner;
/**
 *
 * @author Daksh Sharma 
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //print statement
        System.out.println("scissor (0),rock (1),paper (2): ");
        //taking input from user
        Scanner answer = new Scanner(System.in);
        int b=answer.nextInt();
        //uaing random method to simulate rock paper and scissors
        int a=(int)(Math.random()*2);
         System.out.println("Computer's choice: " + a);
            System.out.println("Your choice: " + b);

        
        if(a==0&&b==1){
            
            System.out.println("The computer is scissor"
                    + ".You are rock,You get a point!!");
        }if (a==1 && b==2){
            System.out.println("The computer is rock"
                    + ".You are paper,You get a point!!");
        }
        if(a==2 && b==0){
             System.out.println("The computer is paper."
                     + "You are scissor,You get a point!!");}
        if(a==1 &&b==0){
            System.out.println("The computer is rock"
                    + ".You are scissor,You lost a point!!");
        }
        if(a==2 && b==1){
           System.out.println("The computer is paper"
                    + ".You are rock,You lost a point!!"); 
        }
        if (a==0 && b==2){
            System.out.println("The computer is scissor"
                    + ".You are paper,You lost a point!!");
        }
        if(a==0 && b==0){
            System.out.println("The computer is scissor."
                    + "You are scissor too,It is a draw");}
        if (a==1 && b==1){
               System.out.println("The computer is rock."
                       + "You are rock too,It is a draw");
            }
        if (a==2 && b==2){
               System.out.println("The computer is rock."
                       + "You are rock too,It is a draw"); 
            }
          
        
        
        
        
       
    }

}
