import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first string:");
            
            String a = sc.nextLine();

           
            if (a.trim().isEmpty()) {
                System.out.println("Error: First string cannot be empty.");
                return; 
            }
            
            
            System.out.println("Enter the second string:");
            String b = sc.nextLine();

            if (b.trim().isEmpty()) {
                System.out.println("Error: Second string cannot be empty.");
                return;
            }

           
            String c = a + " " + b;
            System.out.println("Concatenated string: " + c);

        } catch (Exception e) {
            
            System.out.println("An unexpected error occurred: " + e.getMessage());
            
        } finally {
            
            if (sc != null) {
                sc.close();
            }
        }
    }
}