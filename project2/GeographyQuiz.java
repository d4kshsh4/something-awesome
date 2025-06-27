/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geographyquiz;
import java.util.Scanner;
/**
 *
 * @author Daksh
 */
public class GeographyQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] provinceCapital = {
    {"Alberta", "Edmonton"},
    {"British Columbia", "Victoria"},
    {"Manitoba", "Winnipeg"},
    {"New Brunswick", "Fredericton"},
    {"Newfoundland and Labrador", "St. John's"},
    {"Nova Scotia", "Halifax"},
    {"Ontario", "Toronto"},
    {"Prince Edward Island", "Charlottetown"},
    {"Quebec", "Quebec City"},
    {"Saskatchewan", "Regina"},
    {"Yukon", "Whitehorse"},
    {"Nunavut", "Iqaluit"},
    {"Northwest Territories", "Yellowknife"}
};
    Scanner answer= new Scanner(System.in);
    
    int answercount=0;
    int correctcount=0;
    
      for (int a=0;a<provinceCapital.length;a++){
          System.out.println("What is the capital of "+ provinceCapital[a][0]);
          String ans=answer.nextLine();
          if(provinceCapital[a][1].equalsIgnoreCase(ans)){
              System.out.println("its the correct answer!!!!");
              correctcount++;
            
           }else{
              System.out.println("The correct answer should be "
                      +provinceCapital[a][1]);
              answercount++;
          
          }
         
       }
       
  
        System.out.println("The total correct answers are "+correctcount);
        System.out.println("The total answers attempted are "+answercount);
    }
    
}
