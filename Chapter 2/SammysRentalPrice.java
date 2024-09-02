import java.util.Scanner;
class SammysRentalPrice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");
        
        System.out.print("Enter the number of minutes you rented a piece of sports equipment: ");
         
        int minutes = input.nextInt();
        final int COST_PER_HOUR = 40;
        final int COST_PER_MINUTE = 1;
        
        int hours = minutes / 60;      
        int additionalMinutes = minutes % 60;  

       
        int totalCost;
        if (hours > 0) {
            totalCost = COST_PER_HOUR + (additionalMinutes * COST_PER_MINUTE);
        } else {
            totalCost = additionalMinutes * COST_PER_MINUTE;
        }
       
        System.out.println("\nNumber of hours rented: " + hours);
        System.out.println("Number of additional minutes: " + additionalMinutes);
        System.out.println("Total rental cost: $"+ totalCost);
        
        input.close();
    }
}