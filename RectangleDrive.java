/**java Scanner */
import java.util.*;
/**main class */
public class RectangleDrive {

    /**main method */
    public static void main(String[] args) {

        // java input object Scanner
        Scanner input =new Scanner (System.in);

        // Prompt the user to enter the class password
        // pin:71967
        System.out.println("Enter class pin\nFirst attempt...");
        int password = input.nextInt();
        // System.out.println("First attempt...");

        int attempt = 1;
        while(password != Rectangle.getClassPin()) {
            System.out.println("Invalid pin.Try again: ");
            password = input.nextInt();

            attempt++;

            if (attempt == 2) {
               System.out.println("Second attempt failed!.3 remaining...\n");
            }

            else if(attempt == 3) {
               System.out.println("Third attempt failed!.2 remaining...\n");
            }

            else if(attempt == 4) {
               System.out.println("Fourth attempt failed!.1 remaining...\n");
            }

            else if(attempt == 5) {
               System.out.println("Maximum attempts reached. PROGRAM EXITED!!\nCheck class uml source code for pin!");
               System.exit(0); 
            }         
        }
        
        // Creating the class objects
        Rectangle Rectangle1 = new Rectangle (3, 10);

        System.out.println("The area is " + Rectangle1.getArea());
    }
}