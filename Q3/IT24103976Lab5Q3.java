import java.util.Scanner;

public class IT24103976Lab5Q3 {
    
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;
    
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the start date (1-31): ");
               int startDate = scanner.nextInt();

       		 System.out.print("Enter the end date (1-31): ");
       		 int endDate = scanner.nextInt();

       
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            scanner.close();
            return;        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be earlier than the end date.");
            scanner.close();
            return;         }

        
        int daysReserved = endDate - startDate + 1;

                int discountRate = 0;
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

               if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

               if (discountRate > 0) {
            totalAmount = totalAmount - (totalAmount * discountRate / 100);
        }

               System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + totalAmount);

               scanner.close();
    }
}