import java.util.Scanner;

public class SortingNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("I want you to input three numbers.");
      int firstNum, secondNum, thirdNum;
      
      System.out.print("Enter First Number: ");
      firstNum = input.nextInt();
      
      System.out.print("Enter Second Number: ");
      secondNum = input.nextInt();
      
      System.out.print("Enter Third Number: ");
      thirdNum = input.nextInt();
      
      if (firstNum <= secondNum && secondNum <= thirdNum) {
         System.out.println("Ascending order: " + firstNum + ", " + secondNum + ", " + thirdNum);
      } 
      
      else {
         
         if (firstNum >= secondNum && secondNum >= thirdNum) {
            System.out.println("Numbers already in descending order: " + firstNum + ", " + secondNum + ", " + thirdNum);
         } else {
            
            int valueHolder;
            if (firstNum < secondNum) {
               valueHolder = firstNum;
               firstNum = secondNum;
               secondNum =valueHolder ;
            }
            if (firstNum < thirdNum) {
               valueHolder = firstNum;
               firstNum = thirdNum;
               thirdNum = valueHolder;
            }
            if (secondNum < thirdNum) {
               valueHolder = secondNum;
               secondNum = thirdNum;
               thirdNum = valueHolder;
            }
            System.out.println("Numbers rearranged in descending order: " + firstNum + ", " + secondNum + ", " + thirdNum);
         }
      }
   }
}
