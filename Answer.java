import java.util.Scanner;
public class Answer {
 
public static void main(String[] args) {   
  
  Scanner choice=new Scanner(System.in);
  String answ=null;
  System.out.println("Would you like to continue using the program?");
  
  do {
	  
   answ=choice.nextLine();
   if (answ.equalsIgnoreCase("y")) {
    System.out.println("Thank you for choosing our program");    
   }
   else {
    if (answ.equalsIgnoreCase("n")) {
     System.out.println("We are sorry to see you go");    
    }
    else {
     System.out.println("You should enter y or n");
    }     
   }
   
  } while (!(answ.equalsIgnoreCase("y"))&&!(answ.equalsIgnoreCase("n")));
}  
}