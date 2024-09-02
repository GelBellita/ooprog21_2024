import java.util.Scanner;
class CarlysEventPrice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
        System.out.println("***************************************");
        System.out.println("* Carly's makes the food that makes  *");
        System.out.println("*           it a party                *");
        System.out.println("***************************************\n");
        
        System.out.print("Enter the number of guests: ");
        
        int guests = input.nextInt();
        final int PRICE_PER_PERSON = 35;
        int total = PRICE_PER_PERSON * guests;
        
      System.out.println("\nNumber of guests: "+ guests);
       System.out.println("Price per guests: $" + PRICE_PER_PERSON);
       System.out.println("Total price: $" + total);
       
       if(guests >= 50){
           System.out.println("Large event: True");
       }
       else{
           System.out.println("Large event:false");
       }
        
        input.close();
    }
}