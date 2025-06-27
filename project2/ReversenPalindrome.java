/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversenpalindrome;
import java.util.Scanner;
/**
 *
 * @author Daksh
 */
public class ReversenPalindrome {
    public static int reverse(int number){ 
    
    int newnum;
    int othernum=0;
    while(number!=0) {
         newnum=number%10;
         othernum=othernum*10+newnum;
         number=number/10;
    }
    return othernum;
   }
       
    public static boolean ispalindrome(int number){
        return number==reverse(number);  
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        number=input.nextInt();
        reverse(number);
       
       if(ispalindrome(number)){
           System.out.println(number+" is a palindrome");
       }
       else{
        System.out.println(number+" is not a palindrome");

       }
    }
}