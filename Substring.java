import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start < end) {
            String sub = str.substring(start, end);
            System.out.println("Substring: " + sub);
        } else {
            System.out.println("Invalid indexes 😬");
        }

        sc.close();
    }
}