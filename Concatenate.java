import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String a = sc.next();
        System.out.println("Enter the second string:");
        String b = sc.next();
        
        
        
        String c = a + " " + b;
        System.out.println("Concatenated string: " + c); 
    }
}
